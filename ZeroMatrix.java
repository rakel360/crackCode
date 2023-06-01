import java.util.Arrays;

import javax.sound.midi.spi.SoundbankReader;

public class ZeroMatrix {
    public static void main(String[] args) {
        // int[][] matrix = {{1,1,1},{1,0,0},{1,1,1},{1,1,1}};
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        boolean[][] tracker = new boolean[3][3];

        for(int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("---------");

        for(int[] row: zeroOut(matrix, tracker)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] zeroOut(int[][] matrix, boolean[][] tracker) {

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 0 && !tracker[row][col]) {
                    changeValues(matrix, tracker, row, col);
                }
            }

        }

        return matrix;        
    }

    public static void changeValues(int[][] matrix, boolean[][] tracker, int row, int col) {
        // Change values above
        int topRow = row-1;
        while(topRow >= 0) {
            if(!tracker[topRow][col] && matrix[topRow][col] == 1) {
                matrix[topRow][col] = 0;
                tracker[topRow][col] = true;
            }
            topRow--;
        }

        // Change values below
        int bottomRow = row+1;
        while(bottomRow < matrix.length) {
            if(!tracker[bottomRow][col] && matrix[bottomRow][col] == 1) {
                matrix[bottomRow][col] = 0;
                tracker[bottomRow][col] = true;
            }
            bottomRow++;
        }

        // Change values to the right
        int rightCol = col+1;
        while(rightCol < matrix[row].length) {
            if(!tracker[row][rightCol]  && matrix[row][rightCol] == 1) {
                matrix[row][rightCol] = 0;
                tracker[row][rightCol] = true;
            }
            rightCol++;
        }

        // Change values to the left
        int leftCol = col-1;
        while(leftCol >= 0) {
            if(!tracker[row][leftCol] && matrix[row][leftCol] == 1) {
                matrix[row][leftCol] = 0;
                tracker[row][leftCol] = true;
            }
            leftCol--;
        }
    }
}