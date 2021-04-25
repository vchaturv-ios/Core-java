package Arrays.onedimensional;

public class MissingElementsBetweenRange {
    public static void main(String[] args) {
        int[] arr = {8, 28, 15, 5, 32, 56, 14};
        int[] missing_arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            missing_arr[arr[i]] += 1;
        }

        for (int i = 0; i < missing_arr.length; i++) {
            if (missing_arr[i] < 1 && i > 0)
                System.out.println(i);
        }

    }
}
