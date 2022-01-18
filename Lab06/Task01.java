// Task01

// Create 'integerMatrix' pacakage and put these classes inside it.
// 'IntegerMatrix' class

package integerMatrix;
public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int array[][];

    public IntegerMatrix(int rowNum, int colNum, int linearData[]) {
        if (rowNum * colNum != linearData.length) {
            throw new IllegalArgumentException("The Elements are not proper");
        }

        this.rowNum = rowNum;
        this.colNum = colNum;

        array = new int[rowNum][colNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                array[i][j] = linearData[i * colNum + j];
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowDelim = "";
        String colDelim = "";
        for (int[] row : array) {
            sb.append(rowDelim);
            rowDelim = ";";
            for (int elem : row) {
                sb.append(colDelim);
                colDelim = ",";
                sb.append(elem);
            }

            colDelim = "";
        }

        return sb.toString();
    }

}

// 'IntegerMain' Class

package integerMatrix;

public class IntegerMain {
    public static void main(String args []) {
        int linear [] = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(new IntegerMatrix(4, 3, linear));
    }
}
