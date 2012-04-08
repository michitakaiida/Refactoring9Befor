package ğŒ‹Lq‚Ì“‡;

public class CalcDisability {

	public int disabiilityAmount() {
		int amount = 10;

		Settings settings = new Settings();
		
		if (settings.seniority < 2) {
			amount=0;
		}
		if (settings.monthDisabled > 12) {
			amount=0;
		}
		if (settings.isPartTimer) {
			amount=0;
		}
		return amount;
	}
}
