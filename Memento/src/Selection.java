// (c) 2013 Jason Oliveira, George Mamaladze
public class Selection {
    private int start;
    private int length;

    public Selection(int start, int length){
        setStart(start);
        setLength(length);
    }


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean includes(int index){
        return index >= getStart() && index < getStart() + getLength();
    }

    public static Selection getEmpty(){
        return  new Selection(0,0);
    }
}
