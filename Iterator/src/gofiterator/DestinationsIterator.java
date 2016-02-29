package gofiterator;

import java.util.ArrayList;

public class DestinationsIterator implements Iterator{
	private ArrayList<String> destinations;
	private int position = 0;
	
	/**
	 * Public constructor of DestinationsIterator.
	 * @param destinations array list to iterate
	 */
	public DestinationsIterator(ArrayList<String> destinations){
		this.destinations = destinations;
	}

	@Override
	public void first() {
		position = 0;
	}

	@Override
	public void next() {
		position++;
	}

	@Override
	public boolean isDone() {
		if (position >= destinations.size())
			return true;
		return false;
	}

	@Override
	public Object currentItem() {
		if (isDone()) {
			try {
				throw new Exception("There are no more elements.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return destinations.get(position);
	}

}
