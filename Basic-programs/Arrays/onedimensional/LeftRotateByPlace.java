package Arrays.onedimensional;

public class LeftRotateByPlace {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int number_of_times = 4;
        System.out.println("Left rotated array: ");
        printArray(leftrotate(array, number_of_times));
    }

    private static int[] leftrotate(int[] array, int number_of_times) {
        for (int i = 1; i <= number_of_times; i++) {
            int temp = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println("==============");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
