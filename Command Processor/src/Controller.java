
public class Controller {
	
	CommandProcessor cmdProcessor;
	
	public Controller(){
		cmdProcessor = new CommandProcessor();
	}
	
	public void callUndo(){
		cmdProcessor.undoLastCommand();
	}
	
	public void callRedo(){
		cmdProcessor.redoLastCommand();
	}
	
	public void deletePressed(EditText text, int start, int end, CommandType cmdType){
		AbstractCommand cmd = new DeleteCommand(text, start, end, cmdType);
		cmdProcessor.executeCommand(cmd);
	}
	
	public void upperCasePressed(EditText text, int index, CommandType cmdType){
		AbstractCommand cmd = new UpperCaseLetter(text, index, cmdType);
		cmdProcessor.executeCommand(cmd);
	}
	
	public void lowerCasePressed(EditText text, int index, CommandType cmdType){
		AbstractCommand cmd = new LowerCaseLetter(text, index, cmdType);
		cmdProcessor.executeCommand(cmd);
	}
}
