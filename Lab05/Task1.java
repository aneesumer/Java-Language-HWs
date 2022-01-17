// Create 'task1' pacakage and put these files inside it
// Task 1 a 

package task1;

public class Main {
    public static void main(String [] args) {
        double [] array = new double[]{1.3, 5.2, 7.7, -2.3, 23.45};
        double avg = 0, closest, sum = 0;
        int count =0;

        while (count < array.length) {
            sum = sum + array[count];
            count++;
        }

        avg = sum / array.length;

        closest = array[0];
        count = 0;

        while (count < array.length) {
            if ( Math.abs(avg- array[count]) < Math.abs(avg - closest )){
                closest = array[count];
            }
            count++;
  
      }


      /*
        // Another way of doing it

        double [] diffArray = {0.0,0.0,0.0,0.0, 0.0};

        count = 0;
        while (count < diffArray.length) {
            diffArray[count] = Math.abs(avg - array[count]);
            count++;
        }

        closest = array[0];
        count = 0;
        
        while (count < diffArray.length) {
            if (closest > diffArray[count]) {
                closest = array[count];
            }
           

            System.out.println(diffArray[count]);
            count++;
        }
*/
        System.out.println("The avg of array is: " + avg + " and the closest num is: " + closest);
    }
}

// Task 1 b

package task1;

public class Main {
    public static void main(String[] args) {

        int elem = Integer.parseInt(System.console().readLine("How many elements do you want? "));
        double[] array = new double[elem];
        double avg = 0, closest, sum = 0;
        int count = 0;

        while (count < elem) {

            array[count] = Double.parseDouble(System.console().readLine("Enter the " + count + "th element: "));
            count++;
        }

        count = 0;
        while (count < array.length) {

            
            sum = sum + array[count];
            count++;
        }

        avg = sum / array.length;

        closest = array[0];
        count = 0;

        while (count < array.length) {
            if (Math.abs(avg - array[count]) < Math.abs(avg - closest)) {
                closest = array[count];
            }
            count++;
        }

        // Another way of doing it
        /*
         * double[] diffArray = { 0.0, 0.0, 0.0, 0.0, 0.0 };
         * 
         * count = 0; while (count < diffArray.length) { diffArray[count] = Math.abs(avg
         * - array[count]); count++; }
         * 
         * closest = array[0]; count = 0;
         * 
         * while (count < diffArray.length) { if (closest > diffArray[count]) { closest
         * = array[count]; }
         * 
         * System.out.println(diffArray[count]); count++; }
         */
        System.out.println("The avg of array is: " + avg + " and the closest num is: " + closest);

    }
}

