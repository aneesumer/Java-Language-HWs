// Segment class

import point2d.Point;

public class Segment {
    private double x1, y1, x2, y2;

    public void setter (double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) {
            throw new IllegalArgumentException("Points cant be same");
            
        }
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Point midpoint() {
        Point p = new Point();
        p.x = (x1 + x2)/2.0;
        p.y = (y1 + y2)/2.0;

        return p;
    }

}

// SegmentMain Class

import point2d.Point;

public class SegmentMain {
    public static void main(String[] args) {
        Segment sg = new Segment();
        Point p = new Point();

        sg.setter(1.5, 1.0, 1.5, 2.0);
        p = sg.midpoint();

        System.out.println("The mid-point is: " + p.x + " " + p.y);
    }
}
