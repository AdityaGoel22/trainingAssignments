package d10;

public class App {

	public static void main(String[] args) {
		
//		//Structural pattern
//		
//		Video ytHD = new Youtube(new HDProcessing());
//		ytHD.playVideo();
//		
//		Video nf4k = new Netflix(new FourKProcessing());
//		nf4k.playVideo();
//		
//		Video prime8k = new PrimeChannel(new EightKProcessing());
//		prime8k.playVideo();
		
		//proxy pattern
		
		Payment netbank = new NetBanking();
		netbank.pay(800.00);
		Payment upi = new UPIPayment();
		upi.pay(500.00);
	}

}
