// Task 2 (a)
// 'Point' class

public class Point {
    private double x, y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")" ;
    }
}

// 'Main' class

public class Main {
    public static void main(String [] args) {

        int count =3;
        Point [] array = new Point[count];

        for (int i = 0; i < count; i++) {

            System.out.println("Enter the x-coordinate of Point" + (i+1));
            double x = Double.parseDouble(System.console().readLine());
            
            System.out.println("Enter the y-coordinate of Point" + (i+1));
            double y = Double.parseDouble(System.console().readLine());

            array[i] = new Point(x,y);
        }

        double centreX = 0, centreY = 0;

        for (int i = 0; i < count; i++) {
            centreX = centreX + array[i].getX();
            centreY = centreY + array[i].getY();
        }

        centreX = centreX/count;
        centreY = centreY/count;

        Point p = new Point(centreX, centreY);

        System.out.println("The centre of mass is: " + p);
    }
}

// Task 2 (b)
// 'Point' class

public class Point {
    private double x, y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")" ;
    }

    public static Point centreOfMass (Point [] array) {
    
        double centreX = 0, centreY = 0;

        for (int i = 0; i < array.length; i++) {
            centreX = centreX + array[i].getX();
            centreY = centreY + array[i].getY();
        }

        centreX = centreX/array.length;
        centreY = centreY/array.length;

        return new Point(centreX, centreY);

    }
}

// 'Main' class

public class Main {
    public static void main(String [] args) {

        
        int count =Integer.parseInt(System.console().readLine("Enter the number of Points"));
        Point [] array = new Point[count];

        for (int i = 0; i < count; i++) {

            System.out.println("Enter the x-coordinate of Point" + (i+1));
            double x = Double.parseDouble(System.console().readLine());
            
            System.out.println("Enter the y-coordinate of Point" + (i+1));
            double y = Double.parseDouble(System.console().readLine());

            array[i] = new Point(x,y);
        }


        Point p = Point.centreOfMass(array);

        System.out.println("The centre of mass is: " + p);
    }
}

// Task 2(c)
// 'Point' class


public class Point {
    
    private double x, y;
    public int id;

    static int i = 1;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
        id = i;
        i++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return  id + ":(" + x + "," + y + ")" ;
    }

    public static Point centreOfMass (Point [] array) {
    
        double centreX = 0, centreY = 0;

        for (int i = 0; i < array.length; i++) {
            centreX = centreX + array[i].getX();
            centreY = centreY + array[i].getY();
        }

        centreX = centreX/array.length;
        centreY = centreY/array.length;

        return new Point(centreX, centreY);

    }
}

// 'Main' class

public class Main {
    public static void main(String [] args) {

        
        int count =Integer.parseInt(System.console().readLine("Enter the number of Points"));
        Point [] array = new Point[count];

        for (int i = 0; i < count; i++) {

            System.out.println("Enter the x-coordinate of Point" + (i+1));
            double x = Double.parseDouble(System.console().readLine());
            
            System.out.println("Enter the y-coordinate of Point" + (i+1));
            double y = Double.parseDouble(System.console().readLine());

            array[i] = new Point(x,y);
            System.out.println("ID:" + array[i].id);
        }


        Point p = Point.centreOfMass(array);

        System.out.println("The centre of mass is: " + p);
    }
}




