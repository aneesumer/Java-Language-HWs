// Task02

class ComplexMain {
    public static void main (String [] args) {
        Complex num1 = new Complex();
       num1.re = 3;
       num1.im = 2;

        Complex num2 = new Complex();
        num2.re = 1;
        num2.im = 2;

        System.out.println("The Absolute value is: " + num1.abs());

        num1.add(num2);
        System.out.println("The Sum of two numbers is: " + num1.re + " " + num1.im);

        num1.sub(num2);
        System.out.println("The Subtraction of two numbers is: " + num1.re + " " + num1.im);

        num1.mul(num2);
        System.out.println("The multiplication of two numbers is: " + num1.re + " " + num1.im);

    }
}
