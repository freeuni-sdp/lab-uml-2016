// (c) 2013 Jason Oliveira, George Mamaladze
public class TextBoxMemento implements TextBoxMementoInterface {
    private String text;
    private int caretPosition;
    private Selection selection;
    private int uniqueId;
    private static int uniqueIdCounter = 0;

    public TextBoxMemento(String text, int position, Selection selection){
        this.text = text;
        this.caretPosition = position;
        this.selection = selection;
        uniqueId = ++uniqueIdCounter;
    }

    public String getText() {
        return text;
    }

    public int getCaretPosition() {
        return caretPosition;
    }

    public Selection getSelection() {
        return selection;
    }

    @Override
    public String getDescription() {
        return String.format("Step: '%s'; Caret: %s; Selection:%s-%s", uniqueId, getCaretPosition(), getSelection().getStart(), getSelection().getLength());
    }
}
