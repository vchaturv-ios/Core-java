package Arrays.twodimensional;

public class ArraySort {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        printArray(sort(matrix));
    }

    private static int[][] sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
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
