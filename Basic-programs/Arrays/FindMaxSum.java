package Arrays;

public class FindMaxSum {
    public static void main(String[] args) {
        int[] array = {13, 14, 16, 24, 13, 14, 23};
        int max_sum = array[0] + array[1];
        for (int i = 1; i < array.length - 1; i++) {
            int i1 = array[i] + array[i + 1];
            if (i1 > max_sum) {
                max_sum = i1;
            }
        }
        System.out.println("Maximum sum : " + max_sum);
    }
}
