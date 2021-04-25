package Arrays.onedimensional;

import java.util.Arrays;

public class SortAtEvenPlace {
    public static void main(String[] args) {
        int[] arr = {11, 21, 31, 41, 51, 61, 71, 81, 99};
        int length = arr.length;

        System.out.println("***Original Array***");
        System.out.println(Arrays.toString(arr)+"\n");

        System.out.println("***Swapped Array***");
        System.out.println(Arrays.toString(resultantArray(arr, length)));

    }

    private static int[] resultantArray(int[] arr, int length) {
        int first_even = 0, last_even = arr.length - 1, first_odd = 0, last_odd = arr.length - 1;
        for (int i = 0; i < length / 2; i++) {
            if (length % 2 == 0 && i % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[length - 2 - i];
                arr[length - 2 - i] = temp;
            } else if (length % 2 == 0 && i % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[length - i];
                arr[length - i] = temp;
            }
            if (length % 2 != 0 && i % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[length - i - 1];
                arr[length - i - 1] = temp;
            } else if (length % 2 != 0 && i % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[length - i - 1];
                arr[length - i - 1] = temp;
            }
        }
        return arr;
    }
}
