import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


abstract class SortingTemplate implements Comparator<Integer> {
	
	protected ArrayList<Integer> listOfNumbers = new ArrayList<>();
	
	
	public final void templateMethod(){
		readNumbers();
		sort();
		sortOrder();
		printSortedList();
		cleanList();
	}
	
	private void readNumbers(){
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter how many numbers you want to sort: ");
		int num = input.nextInt();
		for(int i = 0; i < num; i++){
			System.out.print("Enter number: ");
			int temp = input.nextInt();
			listOfNumbers.add(temp);
		}
	}
	
	abstract void sort();
	
	abstract void sortOrder();
	
	private void printSortedList(){
		for (int i = 0; i < listOfNumbers.size(); i++) {
			System.out.print(listOfNumbers.get(i) + " ");
		}
	}
	
	private void cleanList(){
		listOfNumbers.clear();
		System.out.println("");
	}
		
}
