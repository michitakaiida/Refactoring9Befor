package Null�I�u�W�F�N�g�̓���;

public class BillingPlan {
	String plan;
	
	public BillingPlan(int type) {
		// TODO Auto-generated constructor stub
		if (type == 1) {
			plan = "�������ǈ���";
		}
	}
	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public static BillingPlan basic() {
		// TODO Auto-generated method stub
		return null;
	}


}
