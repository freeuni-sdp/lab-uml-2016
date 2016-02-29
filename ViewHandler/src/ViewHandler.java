
import java.util.ArrayList;

// For example we've got a program which has chat windows and video windows.
// each kind of window has its own particular properties and common properties.

public class ViewHandler {
	
	private ArrayList<AbstractView> views;
	
	
	public ViewHandler(){
		views  = new ArrayList<AbstractView>();
		
		
	}
	
	public void openView(AbstractView view){
		views.add(view);
		System.out.println(view.init());
		System.out.println(view.open());
	}
	
	public void closeView(AbstractView view){
		System.out.println(view.close());
		views.remove(view);
	}
	
	public void top(AbstractView view){
		System.out.println("" + view.getName() + " is the winner!");
		
	}
	public void resize(AbstractView view){
		System.out.println(view.resize());
	}
	
	public void update(AbstractView view){
		System.out.println(view.update());
	}
	
	public void move(AbstractView view){
		System.out.println(view.move());
	}
	public void tile(){
		System.out.println("I tiled all views! Hug me!");
	}
	
}
