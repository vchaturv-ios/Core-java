package Arrays.twodimensional;

public class DiagonalReverse {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArray(reverseDiagonal(matrix));
    }

    private static int[][] reverseDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                } else if (i == j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                    matrix[matrix.length - 1 - i][matrix.length - 1 - j] = temp;
                }
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
