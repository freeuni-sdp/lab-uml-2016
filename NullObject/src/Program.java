
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		List<Product> ar= new ArrayList<Product>();
		ar.add(new Meat(ProductFactory.MEAT_PRICE));
		ar.add(new Cheese(ProductFactory.CHEESE_PRICE));
		ProductFactory fac=new ProductFactory();
		String product;
		Scanner in = new Scanner(System.in);
		System.out.print("Currently in stock: ");
		for(Product prod:ar){
			System.out.print(prod.getName()+" ");
		}
		System.out.println();
		while(true){
			
			System.out.println("Please enter which product price u'd like to find out.(Input Exit to quit)");
			product=in.nextLine();
			if(product.contentEquals("Exit")) break;
			Product prod=fac.getProductByName(product);
			System.out.println(prod.getProductInfo());
		}
		in.close();
		
		
	}
}
