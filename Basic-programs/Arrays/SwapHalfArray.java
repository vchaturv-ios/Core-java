package Arrays;

import java.util.Arrays;

public class SwapHalfArray {
    //Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length + 1) / 2 + i];
            arr[(arr.length + 1) / 2 + i] = temp;
        }
        System.out.println("Swapper Array: " + Arrays.toString(arr));
    }
}
