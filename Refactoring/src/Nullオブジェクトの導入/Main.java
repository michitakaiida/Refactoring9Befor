package Null�I�u�W�F�N�g�̓���;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String customerName;
		BillingPlan plan;
		int weeksDelinquent;

		Customer customer = new Customer("iida", new BillingPlan(1),
				new PaymentHistory(), 1);
		Site site = new Site();
		// ���̉����R�����g�A�E�g��Site��customer��null�ɂȂ�B
		site.setCustomer(customer);
		customer = site.getCustomer();

		customerName = customer.getName();

		plan = customer.getplan();

		weeksDelinquent = customer.getHistory().getWeeksDeliquentInLastYear();

		System.out.println(customerName);
		System.out.println(plan.plan);
		System.out.println(weeksDelinquent);

	}
}
