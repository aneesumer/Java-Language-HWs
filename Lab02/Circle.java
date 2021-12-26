// Task04

public class Circle {
    double x ,y;
    double radius;

    void enlarge(double f) {
        radius *= f;
    }

    double getArea () {
        return Math.PI*radius*radius;
    }
}


