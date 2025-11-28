package d10;

public class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		
		System.out.println("Payment done for the amount " + amount);
		
	}

}
