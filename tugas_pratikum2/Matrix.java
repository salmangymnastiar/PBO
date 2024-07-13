package tugas_pratikum2;

import java.util.Scanner;

import static tugas_pratikum2.Transpose.transpose;
import static tugas_pratikum2.Rotate.rotateBack;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please enter the rows in the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Please enter the columns in the matrix");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int[][] second = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                first[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                second[r][c] = sc.nextInt();
            }
        }

        // close the scanner
        sc.close();

        // print both matrices
        System.out.println("First Matrix:\n");
        Print2dArray.print2dArray(first);

        System.out.println("Second Matrix:\n");
        Print2dArray.print2dArray(second);

        int[][] sumMatrix = Dev.dev(first, second);
        int[][] transposedMatrix = transpose(sumMatrix);

        System.out.println("Transposed Matrix:\n");
        Print2dArray.print2dArray(transposedMatrix);

        int[][] originalMatrix = rotateBack(transposedMatrix);

        System.out.println("Original Matrix after rotating back:\n");
        Print2dArray.print2dArray(originalMatrix);
    }
}
