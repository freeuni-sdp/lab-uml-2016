
public class Testing {
	public static void main(String[] args) {
		String text = "Implement the command processor component.";
		EditText et = new EditText(text);
		int start = 2;
		int end = 6;
		Controller ctr = new Controller();
		ctr.deletePressed(et, start, end, CommandType.normal);
		System.out.println(et.getText());
		ctr.callUndo();
		System.out.println(et.getText());
		ctr.upperCasePressed(et, 3, CommandType.normal);
		System.out.println(et.getText());
		ctr.callUndo();
		System.out.println(et.getText());
	}
}
