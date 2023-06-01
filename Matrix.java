import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int[] row: matrix) System.out.println(Arrays.toString(row));


        int[][] matrixB = new int[matrix[0].length][matrix[0].length];

        int len = matrix[0].length - 1;
        
        for(int row = 0; row<4; row++) {
            
            for(int col = 0; col < 4; col++) {
                matrixB[col][len] = matrix[row][col];                
            }

            len--;

        }

        System.out.println("----------------------------");

        for(int[] row: matrixB) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] zeroMatrix(int[][] matrix) {
                        

    }

}