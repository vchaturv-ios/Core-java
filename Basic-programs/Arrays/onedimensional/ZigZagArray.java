package Arrays.onedimensional;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int[] first_array = {1, 2, 3, 4, 5};
        int[] second_array = {6, 7, 8, 9, 10};
        int[] result_array;

        result_array = getZigZagArray(first_array, second_array);
        System.out.println("****Zigzag Array****");
        System.out.println(Arrays.toString(result_array));
    }

    private static int[] getZigZagArray(int[] first_array, int[] second_array) {
        int[] result_array = new int[first_array.length + second_array.length];
        int i = 0, j = 0;

        for (; i < first_array.length && i < second_array.length; i++, j++) {
            result_array[j] = first_array[i];
            j++;
            result_array[j] = second_array[i];
        }

        for (; i < first_array.length; i++) {
            result_array[j] = first_array[i];
            j++;
        }

        for (; i < second_array.length; i++) {
            result_array[j] = second_array[i];
            j++;
        }
        return result_array;
    }
}
