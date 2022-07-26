import java.util.Arrays;
import java.util.Scanner;

public class matrixTranspose {

    static int[][] matrixTransposeOf(int[][] matrix){
        System.out.println("-----------------------------------------------");
        System.out.println("Transapose alma başladı...");

        // computing row and column numbers
        int rowNumber = matrix.length;
        int columnNumber = matrix[0].length;

        // printing original matrix
        System.out.println(rowNumber + " X " + columnNumber + " " + " matris: ");
        for ( int[] i:matrix ){
            System.out.println(Arrays.toString(i));
        }

        // transpose matrix initialization
        int[][] transposeMatrix = new int[columnNumber][rowNumber];

        // transpose matrix
        for (int k = 0; k < columnNumber; k++) {
            for (int l = 0; l < rowNumber; l++) {
                transposeMatrix[k][l] = matrix[l][k];
            }
        }

        // printing transpose matrix
        System.out.println(columnNumber + " X " + rowNumber + " " + " transpose matris: ");
        for ( int[] j:transposeMatrix ){
            System.out.println(Arrays.toString(j));
        }
        System.out.println("-----------------------------------------------");

        return transposeMatrix;
    }


    public static  void main(String[] args){
        int [][] matris = {{1,2,3},{4,5,6}};
        matrixTransposeOf(matris);

        System.out.println("-----------------------------------------------");
        int[][] matris2 = {{1},{1}};
        int[][] transposeOfMatris2 = matrixTransposeOf(matris2);
        for ( int[] row: transposeOfMatris2 ){
            System.out.println(Arrays.toString(row));
        }

    }
}
