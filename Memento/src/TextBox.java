// (c) 2013 Jason Oliveira, George Mamaladze
public class TextBox {
    private String text;
    private int caretPosition;
    private Selection selection;

    public TextBox(){
        setText("");
    }

    public TextBox(String text){
        setText(text);
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

    public void setText(String text) {
        this.text = text;
        caretPosition = 0;
        selection = Selection.getEmpty();
    }

    public void moveCaretBy(int offset){
        caretPosition = getTrimmedValue(getCaretPosition() + offset, 0, getText().length());
    }

    public void moveCaretTo(int position){
        caretPosition = getTrimmedValue(position, 0, getText().length());
    }

    public void select(Selection selection){
        int start = getTrimmedValue(selection.getStart(), 0, getText().length());
        int length = getTrimmedValue(selection.getLength(), 0, getText().length() - start);
        selection = new Selection(start,length);
    }

    public TextBoxMemento createMemento(){
        return new TextBoxMemento(getText(), getCaretPosition(),getSelection());
    }

    public void applyMemento(TextBoxMementoInterface memento) throws Exception{
        if (memento == null)
            throw new IllegalArgumentException("memento");
        TextBoxMemento textBoxMemento;
        try
        {
            textBoxMemento = (TextBoxMemento)memento;
        }
        catch (ClassCastException ex)
        {
            throw new IncompatibleMementoException(String.format("Only memento of type [%s] be applied to [%s] ", memento.getClass().getName(), this.getClass().getName()), ex);
        }

        setText(textBoxMemento.getText());
        moveCaretTo(textBoxMemento.getCaretPosition());
        select(textBoxMemento.getSelection());
    }

    private int getTrimmedValue(int suggestedValue, int minValue, int maxValue) {
        if (suggestedValue < minValue)
            return minValue;

        if (suggestedValue > maxValue)
            return maxValue;

        return suggestedValue;
    }
}
