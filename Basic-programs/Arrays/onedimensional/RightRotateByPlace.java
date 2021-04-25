package Arrays.onedimensional;

public class RightRotateByPlace {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int number_of_times = 4;
        System.out.println("Right rotated array: ");
        printArray(rightrotate(array, number_of_times));
    }

    private static int[] rightrotate(int[] array, int number_of_times) {
        for (int i = 1; i <= number_of_times; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length-2; j >= 0; j--) {
                array[j+1] = array[j];
            }
            array[0] = temp;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println("Entered array");
        System.out.println("==============");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
