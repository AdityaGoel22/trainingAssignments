package trainingd6.proj2;

public interface PaymentInterface {
	
	public abstract void payMehod(double amount);
	
	public default void generateReceipt(double amount) {
		System.out.println("Reciept generated successfully for the amount " + amount);
	}
	
	public static boolean validateAmount(double amount) {
		return amount>0;
	}

}
