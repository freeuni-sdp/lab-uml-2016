import java.util.Stack;

// (c) 2013 Jason Oliveira, George Mamaladze
public class Caretaker {
    private final TextBox textBox;
    private final Stack<TextBoxMementoInterface> undoStack = new Stack<TextBoxMementoInterface>();
    public Caretaker(TextBox textBox){
        this.textBox = textBox;
    }

    public void snapshot(){
        TextBoxMementoInterface memento = textBox.createMemento();
        undoStack.push(memento);
    }

    public void undo() throws Exception {
        if (!canUndo())
            throw new IllegalStateException("Undo stack is empty.");

        TextBoxMementoInterface memento = undoStack.pop();
        textBox.applyMemento(memento);
    }

    private boolean canUndo(){
        return undoStack.size() != 0;
    }

    public String getDescription(){
        return undoStack.peek().getDescription();
    }
}
