
public class DeleteCommand implements AbstractCommand{
	
	EditText editText;
	int startIndex;
	int endIndex;
	String removedTxt;
	CommandType cmdType;
	public DeleteCommand(EditText editText, int start, int end, CommandType cmdType){
		this.editText = editText;
		this.startIndex = start;
		this.endIndex = end;
		this.cmdType = cmdType;
	}
	
	@Override
	public void execute() {
		Supplier supplier = new Supplier(editText.getText());
		this.removedTxt = supplier.getSelectedText(startIndex, endIndex);
		String afterRemove = supplier.deleteText(startIndex, endIndex);
		editText.setText(afterRemove);
	}

	@Override
	public void undo() {
		Supplier supplier = new Supplier(editText.getText());
		String newText = supplier.getString(startIndex, removedTxt);
		editText.setText(newText);
		
	}

	@Override
	public CommandType getType() {
		
		return cmdType;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
