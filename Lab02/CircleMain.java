// Task04

public class CircleMain {
   public static void main(String [] args) {
       
        Circle circle = new Circle();
        circle.radius = 2;

        System.out.println("The area of circle is: " + circle.getArea());

        circle.enlarge(0.5);

        System.out.println("The area of circle is: " + circle.getArea());
   } 
}
