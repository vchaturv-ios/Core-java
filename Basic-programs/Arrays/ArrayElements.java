package Arrays;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        int[] arr = {21, 24, 35, 65, 73, 67};
        System.out.println(Arrays.toString(addElementAtSpecificIndex(arr, 45, 4)));
    }

    private static int[] addElementAtSpecificIndex(int[] array, int element, int index) {
        int length = array.length;
        int[] result_array = new int[length + 1];
        if (index > length || index < 0) {
            System.out.println("Index is out of bound");
        } else if (array == null) {
            System.out.println("Array is null");
        } else {
            for (int i = 0; i < result_array.length; i++) {
                if (i < index) {
                    result_array[i] = array[i];
                } else if (i > index) {
                    result_array[i] = array[i - 1];
                }
                result_array[index] = element;
            }
        }
        return result_array;
    }
}
