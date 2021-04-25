package Arrays.onedimensional;

public class TopTwoMaxElements {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 5, 6, 12, 11};

        int first_max = arr[0];
        int second_max = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first_max) {
                second_max = first_max;
                first_max = arr[i];
            }
            else if (arr[i] > second_max)
                second_max = arr[i];
        }

        System.out.println("First largest number: " + first_max);
        System.out.println("Second largest number: " + second_max);

    }
}
