public class PointMain {
    public static void main(String [] args) {
        Point p = new Point();
        p.x = 1;
        p.y = 1;

        p.move(1,1);

        System.out.println("The Point after move is: " + p.x + " " + p.y);

        p.mirror(2,1);

        System.out.println("The Point after move is: " + p.x + " " + p.y);
}
