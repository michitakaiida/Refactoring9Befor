package Nullオブジェクトの導入;

public class NullCustomer extends Customer {
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "occupant";
	}

	@Override
	public BillingPlan getplan() {
		// TODO Auto-generated method stub
		return BillingPlan.basic();
	}

	@Override
	public PaymentHistory getHistory() {
		// TODO Auto-generated method stub
		return PaymentHistory.newNull();
	}
}
