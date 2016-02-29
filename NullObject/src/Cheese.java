
public class Cheese implements Product{
	private String name;
	private int price;
	public String getName(){
		return "Cheese";
	}
	public Cheese( int price){
		this.name="Cheese";
		this.price=price;
		
	}
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "Price of "+ name+" is "+ price+"$";
	}


}
