package Null�I�u�W�F�N�g�̓���;

public class Customer {
	String customerName ="iida";
	BillingPlan plan = new BillingPlan(1);
	PaymentHistory paymentHistory = new PaymentHistory();
	int weeksDelinquent;



	public String getName() {
		return customerName;
	}

	public BillingPlan getplan() {
		return plan;
	}

	public int getHistory() {
		return weeksDelinquent;
	}
}
