package d10;

public class PrimeChannel extends Video {

	public PrimeChannel(ProcessingQuality quality) {
		super(quality);

	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		
		System.out.print("Playing from PrimeVideo with ");
		quality.processingSpeed();
	}

}
