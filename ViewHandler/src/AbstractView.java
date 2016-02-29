
public abstract class AbstractView {
    protected String name;
	public abstract String init();
	public abstract String resize();
	public abstract String update();
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public String open(){
		return name+": I see the light!";
	}
	
	public String close(){
		return name+": NO, FATHER, NOOOOOOO!!";
	}

	public String move(){
		return name+": We are going for a walk!";
	}
	
}
