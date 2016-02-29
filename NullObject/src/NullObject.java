
public class NullObject implements Product {
	private String name;

	public String getName(){
		return "I am a Null Object I dont have a name";
	}
	public NullObject(){
		this.name="Sorry we don't have such product in our stock";
	
		
	}
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return name;
	}


}
