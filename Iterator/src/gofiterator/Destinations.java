package gofiterator;

import java.util.ArrayList;

public class Destinations implements Iterable{
	private ArrayList<String> destinations = new ArrayList<String>();

	/**
	 * Adds new destination into route.
	 * @param value new destination
	 */
	public void add(String value) {
		destinations.add(value);
	}

	@Override
	public Iterator createIterator() {
		return new DestinationsIterator(destinations);
	}

	// other Destinations methods here ...
}
