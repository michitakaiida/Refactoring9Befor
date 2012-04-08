package �K�[�h��;

public class CalcAmount {
	double result;
	boolean isdead;
	boolean isSeparated;
	boolean isRetired;
	
	public CalcAmount(boolean isdead,boolean isSeparated,boolean isRetired) {
		this.isdead = isdead;
		this.isSeparated = isSeparated;
		this.isRetired= isRetired;
	}
	
	public double getPayAmount() {
		if (isdead) {
			result = deadAmount();
		} else {
			if (isSeparated) {
				result = separatedAmount();
			}else{
				if(isRetired){
					result = retiredAmount();
				}
			}
		}
		return result;
	}

	private static double retiredAmount() {
		// TODO Auto-generated method stub
		return 0.5;
	}

	private static double separatedAmount() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	private static double deadAmount() {
		// TODO Auto-generated method stub
		return 0.1;
	}

}
