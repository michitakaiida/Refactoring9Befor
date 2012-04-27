package Nullオブジェクトの導入;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	// @Ignore("リファクタリングによって不要になった")
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
		assertEquals("高いけど安定", site.getCustomer().getplan().plan);
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
		assertEquals("高いけど安定", customer.plan.plan);
		assertFalse(site.getCustomer().isNull());
	}

}
