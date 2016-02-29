// (c) 2013 Jason Oliveira, George Mamaladze
public class IncompatibleMementoException extends IllegalStateException
{
	private static final long serialVersionUID = 1L;

	public IncompatibleMementoException(String message, ClassCastException innerException) throws Exception {
        super(message, innerException);
    }

}


