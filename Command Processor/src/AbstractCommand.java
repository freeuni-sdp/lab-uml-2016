
public interface AbstractCommand {
	
	public void execute();
	
	public void undo();
	
	public CommandType getType();
	
	public String getName();
	
}
