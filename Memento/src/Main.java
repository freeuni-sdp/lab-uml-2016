// (c) 2013 Jason Oliveira, George Mamaladze

public class Main {
    private static final String ERROR_MESSAGE = "no more saved states, can't undo at this moment";

    public static void main(String args[]){
        TextBox textBox = new TextBox();
        Caretaker caretaker = new Caretaker(textBox);
        System.out.println("------------------------ Initialize");
        textBox.setText("Hello world!");
        System.out.println("------------------------ Selection 3 -> 3");
        textBox.select(new Selection(3, 3));
        textBox.moveCaretBy(2);

        System.out.println(textBox.getText());
        caretaker.snapshot();
        System.out.println("------------------------ Snapshot");
        System.out.println(caretaker.getDescription());

        System.out.println("------------------------ Edit");
        textBox.setText("Good bye world!");
        System.out.println("------------------------ Selection 4 -> 4");
        textBox.select(new Selection(4,5));
        textBox.moveCaretBy(8);
        System.out.println(textBox.getText());
        caretaker.snapshot();
        System.out.println("------------------------ Snapshot");
        System.out.println(caretaker.getDescription());

        System.out.println("------------------------ Edit");
        textBox.setText("Foo");
        System.out.println(textBox.getText());
        try {
            caretaker.undo();
        }catch (Exception e){
            System.out.println(ERROR_MESSAGE);
        }
        System.out.println("------------------------ Undo");
        System.out.println(textBox.getText());
        try {
            caretaker.undo();
        }catch (Exception e){
            System.out.println(ERROR_MESSAGE);
        }
        System.out.println("------------------------ Undo");
        System.out.println(textBox.getText());

        try {
            caretaker.undo();
        }catch (Exception e){
            System.out.println(ERROR_MESSAGE);
        }
    }

}
