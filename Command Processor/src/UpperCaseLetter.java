
public class UpperCaseLetter implements AbstractCommand{

	EditText editText;
	CommandType cmdType;
	int index;
	
	public UpperCaseLetter(EditText editText, int index, CommandType cmdType){
		this.editText = editText;
		this.cmdType = cmdType;
		this.index = index;
	}
	
	@Override
	public void execute() {
		Supplier supplier = new Supplier(editText.getText());
		String edited = supplier.upperCaseText(index);
	    this.editText.setText(edited);
	}

	@Override
	public void undo() {
		Supplier supplier = new Supplier(editText.getText());
		String edited = supplier.lowerCaseText(index);
	    this.editText.setText(edited);
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
