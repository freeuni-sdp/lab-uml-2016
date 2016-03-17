package facade_new;

class PointPolar {
    private double radius, angle;
    public PointPolar( double r, double a ) {
        radius = r;
        angle = a;
    }

    public void  rotate( int ang ) {
        angle += ang % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
