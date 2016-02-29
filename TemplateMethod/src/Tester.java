import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		IncreasingOrder temp1 = new IncreasingOrder();
		DecreasingOrder temp2 = new DecreasingOrder();

		Scanner input = new Scanner(System.in);
		
		System.out.println("To sort by increasing order press 1");
		System.out.println("To sort by decreasing order press 2");
		System.out.println("To EXIT press 0");
		
		int choice = -1;
		
		while (choice != 0) {
			System.out.println("Make your choice:");
			choice = input.nextInt();
			switch (choice) {
				case 1:
					temp1.templateMethod();
					break;
				case 2:
					temp2.templateMethod();
					break;
			}	
		}
	}
}
