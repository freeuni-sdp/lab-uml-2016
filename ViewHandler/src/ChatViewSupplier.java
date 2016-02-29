
public class ChatViewSupplier implements ViewSupplier{

	@Override
	public String resizeOptions() {
		return "Chat view shouldn't be more than 800x400!";
	}

	@Override
	public String updateOptions() {
		return "update every second!";
	}

}
