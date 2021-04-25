package Arrays.twodimensional;

import java.util.Scanner;

public class ReadAndWriteOperation {
    public static void main(String[] args) {
        int[][] array = readArray();
        printArray(array);
    }

    private static int[][] readArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Matrix...");
        System.out.println("========================");

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        System.out.println();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void printArray(int[][] matrix) {
        System.out.println("Entered matrix");
        System.out.println("==============");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
