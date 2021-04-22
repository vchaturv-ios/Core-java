package Arrays;

public class TopTwoMinElements {
    public static void main(String[] args) {
        int[] arr = {56, 24, 67, 61, 42, 87, 59};
        int first_min = arr[0];
        int second_min = arr[1];
        int i = 1;

        for (; i < arr.length; i++) {
            if (arr[i] < first_min) {
                second_min = first_min;
                first_min = arr[i];
            } else if (arr[i] < second_min) second_min = arr[i];
        }
        System.out.println("First Minimum Element: " + first_min);
        System.out.println("Second Minimum Element: " + second_min);
    }
}
