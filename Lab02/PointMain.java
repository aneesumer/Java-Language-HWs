public class PointMain {
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
