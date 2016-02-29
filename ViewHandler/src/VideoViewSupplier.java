
public class VideoViewSupplier implements ViewSupplier{

	@Override
	public String resizeOptions() {
		return "Video view size shouldn't be less than 300x200!";
		
	}

	@Override
	public String updateOptions() {
		return "update everu 0.01 seconds!";
		
	}

}
