package Null�I�u�W�F�N�g�̓���;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	// @Ignore("���t�@�N�^�����O�ɂ���ĕs�v�ɂȂ���")
	public void nullTest() {
		// Customer customer = new Customer();
		Customer customer = null;
		Site site = new Site();
		site.setCustomer(customer);
		// assertNull(site.getCustomer().customerName);
		// assertNull(site.getCustomer().plan);
		// assertNull(site.getCustomer());
		assertEquals("occupant", site.getCustomer().getName());
		assertTrue(site.getCustomer().isNull());
		assertEquals("�������ǈ���", site.getCustomer().getplan().plan);
		assertEquals(0, site.getCustomer().getHistory()
				.getWeeksDeliquentInLastYear());

	}

	@Test
	public void notNullTest() {
		Customer customer = new Customer("iida", new BillingPlan(1),
				new PaymentHistory(), 1);
		Site site = new Site();
		site.setCustomer(customer);
		customer = site.getCustomer();
		assertNotNull(site.getCustomer());
		assertEquals("iida", customer.customerName);
		assertEquals("�������ǈ���", customer.plan.plan);
		assertFalse(site.getCustomer().isNull());
	}

}
