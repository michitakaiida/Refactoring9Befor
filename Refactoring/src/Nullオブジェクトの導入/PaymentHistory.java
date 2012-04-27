package Nullオブジェクトの導入;

public class PaymentHistory {

	int getWeeksDeliquentInLastYear() {
		return 10;
	}

	static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}
}
