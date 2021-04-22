package Arrays;

import java.util.Arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[] num_arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //First approach
        Arrays.sort(num_arr);
        System.out.println("Maximum element in the array with first approach: " + num_arr[num_arr.length - 1]);

        //Second approach
        int max = num_arr[0];
        for (int i = 1; i < num_arr.length; i++) {
            if (num_arr[i] > max)
                max = num_arr[i];
        }
        System.out.println("Maximum element in the array with second approach: " + max);

    }
}
