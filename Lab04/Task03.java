// Task3 (a)

// 'Circle' class

public class Circle {
    private double x = 0, y = 0, radius = 1;

    public double getArea() {
        return Math.PI *radius *radius;
    }

}


// 'CircleMain' class

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println(c.getArea());

        // Now Change the radius to 10 and centre to (5,2) and print again the area
    }   
}

// Task 3 (b)
// 'Circle' class

public class Circle {
    private double x = 0, y = 0, radius = 1;

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public double getRadius () {
        return radius;
    }

    void setX (double x) {
        this.x = x;
    }

    void setY (double y) {
        this.y = y;
    }

    void setRadius (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI *radius *radius;
    }

}

// 'CircleMain' class

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setX(3);
        c.setY(5);
        c.setRadius(10);

        System.out.println(c.getArea());

  
    }   
}

// Task3 (c)
// 'Circle' class

public class Circle {
    private double x = 0, y = 0, radius = 1;

    public Circle (double x, double y, double radius) {
        this.x= x;
        this.y = y;
        this.radius =radius;
    }
    
    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public double getRadius () {
        return radius;
    }

    public double getArea() {
        return Math.PI *radius *radius;
    }

}

// 'CircleMain' class

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(3,4,10);
    
        System.out.println(c.getArea());

  
    }   
}

