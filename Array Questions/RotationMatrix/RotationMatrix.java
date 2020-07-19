import java.util.Arrays;

public class RotationMatrix {

    // inplace solution is required

    // outplace sollution
    public static int[][] rotationMatrixOutplace(int matrix[][]) {
        int temp[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int k=0;
            for (int j =matrix.length-1 ; j >= 0 ; j--) {
                temp[i][k] = matrix[j][i];
                k++;
            }
        }
        return temp;
    }

    // inplace solution
    public static int[][] rotationMatrixInplace(int matrix[][]) {

        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix.length-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = matrix[j][matrix.length-1-i]; 
                matrix[j][matrix.length-1-i] = temp;
            }
        }

        return matrix;
    }



    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        System.out.println("input :");
        for (int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int results[][] = rotationMatrixInplace(matrix);
        
        System.out.println("output :");
        for (int i=0; i<results.length; i++) {
            System.out.println(Arrays.toString(results[i]));
        }
        
    }
}