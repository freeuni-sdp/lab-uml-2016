
public class ProductFactory {
	public static final int MEAT_PRICE=10;
	public static final int CHEESE_PRICE=10;
	
	public ProductFactory(){
		
	}
	public Product getProductByName(String name){
		Product prod=null;
		switch(name){
			case "Meat":
				prod=new Meat(MEAT_PRICE);
				break;
			case "Cheese":
				prod=new Cheese(CHEESE_PRICE);
				break;
			default:
				prod=new NullObject();
				break;
		}
		return prod;
	}

}
