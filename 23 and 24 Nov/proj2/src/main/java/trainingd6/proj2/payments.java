package trainingd6.proj2;

public class payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc = new CreditCard();
		cc.payMehod(4500);
		
		UPI upi = new UPI();
		upi.payMehod(50);
		
		PaymentInterface cd = new CreditCard();
		cd.payMehod(800);
		
		PaymentInterface upd = new UPI();
		upd.payMehod(200);
	}
//write a lambda exp to print your na e using a functional interface with a single abstract method printname
}
