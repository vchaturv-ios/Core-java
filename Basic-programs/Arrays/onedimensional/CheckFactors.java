package Arrays.onedimensional;

public class CheckFactors {
    public static void main(String[] args) {
        int[] arr = {3, 15, 5, 45, 27, 35};

        int count_5 = 0;
        int count_3 = 0;
        int count_3_5 = 0;

        int i = 0;

        while (i < arr.length) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                count_3_5++;
            } else if (arr[i] % 3 == 0) {
                count_3++;
            } else if (arr[i] % 5 == 0) {
                count_5++;
            }
            i++;
        }

        System.out.println("Count of 3 and 5 : " + count_3_5);
        System.out.println("Count of 5 : " + count_5);
        System.out.println("Count of 3 : " + count_3);
    }
}
