// Create a 'utils' package and place these classes inside it
// 'DoubleVector' class

package utils;

public class DoubleVector {
    private double x, y, z;

    public DoubleVector (double [] array) {
        this.x = array[0];
        this.y = array[1];
        this.z = array[2];
    }

    public void scalarProduct (DoubleVector v) {
        x = x * v.x;
        y = y * v.y;
        z = z * v.z;

    }

    public void sumOfVectors (DoubleVector v) {
        x = x + v.x;
        y = y + v.y;
        z = z + v.z; 
    }

    public void diffOfVectors (DoubleVector v) {
        v.x = - v.x;
        v.y = - v.y;
        v.z = - v.z;

        sumOfVectors(v);
   }

   public void prodWithScalar (Double s) {
         x = s * x;
         y = s * y;
         z = s * z;

    }

    public String stringRep () {
        return "(" + x + "," + y + "," + z + ")";
    }

    
}

// 'VectorMain' class

package utils;

public class VectorMain {
    public static void main(String[] args) {
        double [] arr1 = {1,2,3};
        double [] arr2 = {4,5,6};
        double scalar = 5;

        DoubleVector v1 = new DoubleVector(arr1);
        DoubleVector v2 = new DoubleVector(arr2);

        v1.scalarProduct(v2);
        System.out.println(v1.stringRep());

        v1.sumOfVectors(v2);
        System.out.println(v1.stringRep());

        v1.diffOfVectors(v2);
        System.out.println(v1.stringRep());

        v1.prodWithScalar(scalar);
        System.out.println(v1.stringRep());
        
    }
}

