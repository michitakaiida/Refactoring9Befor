package Null�I�u�W�F�N�g�̓���;

public class PaymentHistory {

	int getWeeksDeliquentInLastYear() {
		return 10;
	}

	static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}
}
