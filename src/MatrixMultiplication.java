import java.util.Scanner;
import java.util.Arrays;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Enter Matrix A Dimensions ---");
        System.out.print("Enter number of rows: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsA; j++)
            {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n--- Enter Matrix B Dimensions ---");
        System.out.print("Enter number of rows: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int colsB = scanner.nextInt();
        if (colsA != rowsB)
        {
            System.out.println("\nError: Matrices cannot be multiplied.");
            System.out.println("Columns of Matrix A (" + colsA + ") must match Rows of Matrix B (" + rowsB + ").");
            scanner.close();
            return;
        }
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rowsB; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        int[][] resultMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                for (int k = 0; k < colsA; k++)
                {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("\nResult of Multiplication (Matrix A * Matrix B):");
        printMatrix(resultMatrix);
        scanner.close();
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}