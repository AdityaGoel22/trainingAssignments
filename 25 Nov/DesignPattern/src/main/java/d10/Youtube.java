package d10;

public class Youtube extends Video {

	public Youtube(ProcessingQuality quality) {
		super(quality);
	
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		
		System.out.print("Playing from Youtube with ");
		quality.processingSpeed();
	}

}
