
public class VideoView extends AbstractView{
	VideoViewSupplier sup;
	public VideoView(){
		sup = new VideoViewSupplier();
	}

	@Override
	public String init() {
		return name+": oh, new world!";
		
	}

	@Override
	public String resize() {
		System.out.println(sup.resizeOptions());
		return name+": resizing, yohoo!";
		
	}

	@Override
	public String update() {
		System.out.println(sup.updateOptions());
		return name+": I smell changes...";
		
	}

}
