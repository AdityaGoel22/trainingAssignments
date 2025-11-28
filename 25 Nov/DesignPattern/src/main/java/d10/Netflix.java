package d10;

public class Netflix extends Video {

	public Netflix(ProcessingQuality quality) {
		super(quality);
		
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		
		System.out.print("Playing from Netflix with ");
		quality.processingSpeed();
	}

}
