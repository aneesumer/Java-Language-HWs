// Task07

public class CommandLineArguments {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Insufficient Arguments!");
        } else {

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("The sum is: " + (num1 + num2));
            System.out.println("The diff is: " + (num1 - num2));
            System.out.println("The prod is: " + (num1 * num2));
            if (num2 == 0) {
                System.out.println("Division Cant be Performed!");
            }
            else{
                System.out.println("The qoutient is: "+ ( num1/num2));
                System.out.println("The reminder is: " + (num1%num2));
            }
        }

    }
}
