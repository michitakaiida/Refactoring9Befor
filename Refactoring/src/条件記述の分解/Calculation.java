package �����L�q�̕���;

public class Calculation {
	public int calcCharge() {
		int month = 1;
		int charge;
		int quantity = 5;
		int summerRate = 10;
		int nonSummerRate = 2;

		// TODO Auto-generated method stub
		if (isSummer(month)) {
			charge = quantity * summerRate;
		} else {
			charge = quantity * nonSummerRate;
		}
		return charge;
	}

	private boolean isSummer(int month) {
		return 6 < month && month < 9;
	}
}