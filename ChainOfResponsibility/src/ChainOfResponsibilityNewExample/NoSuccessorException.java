package ChainOfResponsibilityNewExample;

public class NoSuccessorException extends RuntimeException{
	
	/**
	 * Thorws Exception In case we have no "Next Chain"
	 */
	private static final long SERIALVERSIONUID = 1L;

	public NoSuccessorException(){
		super("No Successor Found");
	}

}
