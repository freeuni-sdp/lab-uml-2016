package facade_new;

class Line {
    private Point o, e;
    public Line( Point ori, Point end ) {
        o = ori;
        e = end;
    }

    public void  move( int dx, int dy ) {
        o.move( dx, dy );
        e.move( dx, dy );
    }

    public void  rotate( int angle ) {
        e.rotate( angle, o );
    }

    public String toString() {
        return "origin is " + o + ", end is " + e;
    }
}
