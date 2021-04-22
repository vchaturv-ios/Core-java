package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int arr_length = arr.length;

        //By creating new arrays
        reverse(arr, arr_length);
    }

    private static void reverse(int[] arr, int arr_length) {
        int[] new_arr = new int[arr_length];
        int j = arr_length;

        for(int i = 0; i < arr.length; i++) {
            new_arr[j-1] = arr[i];
            j--;
        }

        System.out.println("*******Reversed array*******");
        System.out.println(Arrays.toString(new_arr));
    }
}
