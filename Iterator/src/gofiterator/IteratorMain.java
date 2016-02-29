package gofiterator;

public class IteratorMain {
	
	public static void main(String[] args) {
		Destinations destinations = new Destinations();
		
		destinations.add("Santiago");
		destinations.add("Buenos Aires");
		destinations.add("Atlanta");
		destinations.add("New York");
		destinations.add("Madrid");
		destinations.add("Torino");
		destinations.add("Napoli");
		
		Iterator iter = destinations.createIterator();
		System.out.println("Viaggio d'andata");
		while (!iter.isDone()){
			System.out.println(iter.currentItem());
			iter.next();
		}
	}
}
