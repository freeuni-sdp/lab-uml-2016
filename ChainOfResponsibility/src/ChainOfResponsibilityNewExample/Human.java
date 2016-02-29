package ChainOfResponsibilityNewExample;

//Human Class for Managing
public class Human {
	private String Name;
	private String Lastname;
	private int Height;
	public Human(String name,String lastname, int height){
		this.Name = name;
		this.Lastname = lastname;
		this.Height = height;
	}
	public int getHeight(){
		return this.Height;
	}
	public String getNameLastName(){
		return Name + " " + Lastname;
	}
}
