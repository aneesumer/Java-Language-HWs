// Task08

public class FactorialNum {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int num = Integer.parseInt(System.console().readLine());
        int fact = 1;

        for (int i = num; i > 0 ; i-- ) {
            fact *= i;
        }

        System.out.println("The factorial is: " + fact);
    }
}
