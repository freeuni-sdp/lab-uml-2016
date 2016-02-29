
public class Test {

	
	public static void main(String[] args) {
		
		ViewHandler vh = new ViewHandler();
		AbstractView myChat  = new ChatView();
		myChat.setName("Little Chatty");
		vh.openView(myChat);
		AbstractView myVideo = new VideoView();
		myVideo.setName("Videoman");
		vh.openView(myVideo);
		
		vh.move(myChat);
		vh.move(myVideo);
		
		vh.update(myVideo);
		vh.update(myChat);
		
//		vh.resize(myVideo);
//		vh.resize(myChat);
		
		vh.closeView(myVideo);
		vh.closeView(myChat);
		
		
	}
}
