package d10;

public class NetBanking implements Payment{

	private CashPayment cash = new CashPayment();
	
	@Override
	public void pay(double amount) {
		System.out.println("Username and Password Validated");
		System.out.println("OTP Verification Successfully");
		System.out.println("Payment Successful");
		
		cash.pay(amount);
	}

}
