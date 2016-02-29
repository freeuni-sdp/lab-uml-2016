import java.util.Stack;


public class CommandProcessor {
	
	Stack<AbstractCommand> cmds;
	
	public CommandProcessor(){
		cmds = new Stack<AbstractCommand>();
	}
	
	public void executeCommand(AbstractCommand cmd){
		cmd.execute();
		switch (cmd.getType()){
        case normal:
            cmds.push(cmd);
            break;
        case no_undo:
            cmds.clear();
            break;
		}
	}
	
	public void undoLastCommand(){
		if(cmds.isEmpty()){
			return;
		}
		AbstractCommand cmd = cmds.pop();
		cmd.undo();
		cmds.push(cmd);
	}
	
	public void redoLastCommand(){
		if(cmds.isEmpty())
			return;
		AbstractCommand cmd = cmds.pop();
		executeCommand(cmd);
	}
}
