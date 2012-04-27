package Nullオブジェクトの導入;

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
		// この下をコメントアウトでSiteのcustomerがnullになる。
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
