
public class ChatView extends AbstractView {
	ChatViewSupplier sup;
	public ChatView(){
		sup = new ChatViewSupplier();
	}

	@Override
	public String init() {
		return name+": I am booorn!";
		
	}

	@Override
	public String resize() {
		System.out.println(sup.resizeOptions());
		return name+": I was resized!";
		
	}

	@Override
	public String update() {
		System.out.println(sup.updateOptions());
		return name+ ": Who is here?!";
		
	}

}
