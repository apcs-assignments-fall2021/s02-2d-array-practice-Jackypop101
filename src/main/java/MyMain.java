import java.util.ArrayList;

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int w = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                if (mat[row][col]%2 != 0) {
                    w++;
                }
            }
        }
        return w;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int w = Integer.MIN_VALUE;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                if (mat[row][col]>w) {
                    w = mat[row][col];
                }
            }
        }
        return w;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int row = 0; row < mat.length; row++){
            int x = mat[row][0];
            for (int col = 1; col < mat[0].length; col++){
                if (col != mat[0].length-1){
                mat[row][col-1] = mat[row][col];
                }
                else if (col == mat[0].length-1){
                    mat[row][col-1] = mat[row][col];
                    mat[row][col] = x;
                }
            }
        }
        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int [][] mat = new int[arraySize][arraySize];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                    mat[row][col] = row + col;

            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double w = 0;
        int size = mat.length * mat[0].length;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                    w += mat[row][col];
            }
        }
        return w/size;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
//
        int size = mat.length * mat[0].length;
        int median = size / 2;

        ArrayList<Double> arr = new ArrayList<Double>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                arr.add(mat[row][col]);
            }
        }
        double x = (arr.get(median) + arr.get(median - 1)) / 2;
        if (size % 2 == 0) {
            return x;
        }
        else if (size % 2 == 1) {
            return arr.get(median);
        }
        return arr.get(median);

    }



    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int w = 0;
        double O = 0;
        int k = 0;
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                arr.add(mat[row][col]);
            }
        }
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; row < arr.size(); i++){
                    if (arr.get(i) == mat[row][col]){
                        w ++;
                    }
                }
                if (w > k){
                    k = w;
                    w = 0;
                    O = mat[row][col];
                }
            }
        }
        return O;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
