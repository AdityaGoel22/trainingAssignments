package trainingd6.proj2;

public class CreditCard implements PaymentInterface{

	@Override
	public void payMehod(double amount) {
		if (PaymentInterface.validateAmount(amount)) {
			System.out.println("Amount paid " + amount + "using credit card");
			generateReceipt(amount);
		}
		else {
			System.out.println("Payment unsuccessful, invalid amount");
		}
	}
}
