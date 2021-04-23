package Arrays;

public class OddEvenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int even_sum = 0;
        int odd_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even_sum += arr[i];
            else
                odd_sum += arr[i];
        }

        System.out.println("Sum of Even numbers : " + even_sum);
        System.out.println("Sum of Odd numbers : " + odd_sum);
    }
}
