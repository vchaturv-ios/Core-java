package Arrays.onedimensional;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 5, 2, 6, 3};
        printArray(sort(arr));

    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static void printArray(int[] array) {
        System.out.println("Entered matrix");
        System.out.println("==============");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
