// Task01 & Task02
// For Main Program, go to PointMain.java

public class Point {
    
        double x, y;
        
        void move (double dx, double dy) {
            x += dx;
            y += dy;
        }

        void mirror (double cx, double cy) {
            x = 2*cx -x;
            y = 2*cy -y;
        }
    
    /*
        void mirror (Point p) {
            x = 2*p.x -x;
            y = 2*p.y -y;
        }

        double distance (Point P) {
           return Math.sqrt((x-P.x)*(x-P.x) + (y-P.y)*(y-P.y));
        }
*/  
