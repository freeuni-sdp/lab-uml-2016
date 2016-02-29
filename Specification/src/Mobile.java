
public class Mobile {

	private String BrandName;
	private String Type;
	private int cost;
	public Mobile(String BrandName, String Type, int cost){
		this.BrandName = BrandName;
		this.Type = Type;
		this.cost = cost;
	}
	
	public String getBrandName(){
		return this.BrandName;
	}
	
	public String getType(){
		return this.Type;
	}
	
	public int getCost(){
		return this.cost;
	}
	
}
