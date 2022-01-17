// Create a 'circle.utils' package and place this class inside it
// 'Point' class

package circle.utils;

public class Point {
    
    private double x, y;
    
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
   
}

// Place this inside 'circle' pacakge 
// 'Circle' class

package circle;
import circle.utils.Point;

public class Circle {

    private double x, y;
    private double radius;
    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    Point getCenter () {
      
        Point p = new Point(x,y);
      /* Task (b)
        p.setX(x);
        p.setY(y);
      */
        return p;
    }
}

// place it inside 'circle' package
// 'Main' class

package circle;
import circle.utils.Point;

public class Main {
    public static void main(String [] args) {
        Circle c = new Circle(2,4,10);
        Point p ;

        p = c.getCenter();
        System.out.println("The Centre of Circle is: " + p.getX() + " " + p.getY());
    }
}

