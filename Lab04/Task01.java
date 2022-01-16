// Change the file name and also create a package 'point2d'.

// Point class ---> Put it in 'point2d' as a separate compilation unit.

package point2d;
class Point {
    
    public double x, y;
    
    public void move (double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void mirror (double cx, double cy) {
        x = 2*cx -x;
        y = 2*cy -y;
    }

    public void mirror (Point p) {
        x = 2*p.x -x;
        y = 2*p.y -y;
    }

    public double distance (Point P) {
       return Math.sqrt((x-P.x)*(x-P.x) + (y-P.y)*(y-P.y));
    }
}

// Main Program  --->> Put it in 'point2d' as a separate compilation unit.

package point2d;
class PointMain {
    public static void main(String [] args) {
        Point p = new Point();
        p.x = 1;
        p.y = 1;

        p.move(1,1);

        System.out.println("The Point after move is: " + p.x + " " + p.y);

        p.mirror(2,1);

        System.out.println("The Point after move is: " + p.x + " " + p.y);

        Point q = new Point();
        q.x = 5;
        q.y = 5;

        System.out.println("The distance of p from q is: " + p.distance(q));

        Point s = new Point();
        s.x = 2;
        s.y = 1;

        p.mirror(s);


        System.out.println("The Point after move is: " + p.x + " " + p.y);
    }
}



