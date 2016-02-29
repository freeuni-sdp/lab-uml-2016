
public class Meat implements Product {
	private String name;
	private int price;
	public String getName(){
		return "Meat";
	}
	public Meat( int price){
		this.name="Meat";
		this.price=price;
		
	}
	
	
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "Price of "+ name+" is "+price +"$";
	}

}
