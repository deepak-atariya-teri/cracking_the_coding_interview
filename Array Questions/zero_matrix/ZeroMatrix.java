
package zero_matrix;

import java.util.Arrays;

/**
 * ZeroMatrix
 * 
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to O.
 */
public class ZeroMatrix {

    public static void zero_matrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            Boolean isZero = false;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==0){
                    isZero = true;
                    break;
                }
            }
            if(isZero){
                for (int k = 0; k < matrix.length; k++){
                    matrix[i][k] = 0; 
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void main(String[] args) {
        // System.out.println("asdfasd");
        int input[][] = {
            {1,2,3},
            {1,2,0},
            {1,2,4},
        };
        zero_matrix(input);
    }
}