package gofiterator;

public interface Iterator {

	/**
	 * Initializes the current element to the first element.
	 */
	public void first();
	
	/**
	 * Advances the current element to the next element,
	 */
	public void next();
	
	/**
	 * Tests whether we've advanced beyond the last element.
	 * @return true if the index is more than last index, else false
	 */
	public boolean isDone();
	
	/**
	 * Returns the current element in the sequence.
	 */
	public Object currentItem();
}
