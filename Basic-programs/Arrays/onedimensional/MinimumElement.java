package Arrays.onedimensional;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 5, 4, 2, 3};
        int minimum_element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum_element) {
                minimum_element = arr[i];
            }
        }

        System.out.println("Minimum element in the array: " + minimum_element);
    }
}
