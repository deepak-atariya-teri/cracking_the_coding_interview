import java.util.Arrays;

public class RotationMatrix {

    // inplace solution is required

    // brute force method
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



    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int results[][] = rotationMatrixOutplace(matrix);

        System.out.println("input :");
        for (int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        System.out.println("output :");
        for (int i=0; i<results.length; i++) {
            System.out.println(Arrays.toString(results[i]));
        }
        
    }
}