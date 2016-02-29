
public class Supplier {
	String text;
	public Supplier(String text){
		this.text = text;
	}
	
	public String getSelectedText(int start, int end){
		return text.substring(start, end);
	}
	
	public String deleteText(int start, int end){
		String afterRemove = text.substring(0, start) + text.substring(end);
		return afterRemove;
	}
	
	public String getString(int start, String removed){
		String newText = text.substring(0, start) + removed + text.substring(start);
		return newText;
	}
	
	public String upperCaseText(int index){
		StringBuilder sb = new StringBuilder(text);
		char c = sb.charAt(index);
	    if (Character.isLowerCase(c)) {
	        sb.setCharAt(index, Character.toUpperCase(c));
	    }
	    return sb.toString();
	}
	
	public String lowerCaseText(int index){
		StringBuilder sb = new StringBuilder(text);
		char c = sb.charAt(index);
	    if (Character.isUpperCase(c)) {
	        sb.setCharAt(index, Character.toLowerCase(c));
	    }
	    return sb.toString();
	}
}
