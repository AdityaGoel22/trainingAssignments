package d10;

public class UPIPayment implements Payment{

	private CashPayment cash = new CashPayment();
	
	@Override
	public void pay(double amount) {
		System.out.println("User Validated");
		System.out.println("OTP Verification Successfully");
		System.out.println("Payment Successful");
		
		cash.pay(amount);
	}

}
