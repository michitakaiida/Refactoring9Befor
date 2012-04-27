package Null�I�u�W�F�N�g�̓���;

public class Customer {
	String customerName;
	BillingPlan plan;
	PaymentHistory paymentHistory;
	int weeksDelinquent;

	public Customer(String customerName, BillingPlan plan,
			PaymentHistory paymentHistory, int weeksDelinquent) {
		super();
		this.customerName = customerName;
		this.plan = plan;
		this.paymentHistory = paymentHistory;
		this.weeksDelinquent = weeksDelinquent;
	}

	protected Customer() {
		// TODO Auto-generated constructor stub
		// �p������q�N���X���e�N���X�̃R���X�g���N�^�[��K���Ă΂Ȃ��Ă͂����Ȃ��Bprotced�ɂ���̂́A�T�u�ȊO���Ă΂Ȃ��悤�ɂ���B
	}

	public String getName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BillingPlan getplan() {
		return plan;
	}

	public void setPlan(BillingPlan plan) {
		this.plan = plan;
	}

	public PaymentHistory getHistory() {
		return this.paymentHistory;
	}

	public void setHistory(PaymentHistory paymentHistory) {
		this.paymentHistory = paymentHistory;
	}

	public int getWeeksDelinquent() {
		return weeksDelinquent;
	}

	public void setWeeksDelinquent(int weeksDelinquent) {
		this.weeksDelinquent = weeksDelinquent;
	}

	public boolean isNull() {
		return false;
	}

	static Customer newnull() {
		return new NullCustomer();
	}

}
