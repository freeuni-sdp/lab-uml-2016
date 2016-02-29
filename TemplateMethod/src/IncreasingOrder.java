import java.util.Collections;
import java.util.Comparator;


public class IncreasingOrder extends SortingTemplate {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2){
			return -1;
		} else if(o1 > o2){
			return 1;
		}
		return 0;
	}
 
	@Override
	void sort() {
		Collections.sort(listOfNumbers, new IncreasingOrder());
	}

	@Override
	void sortOrder() {
		System.out.print("Printing numbers in increasing order: ");
	}
	
}
