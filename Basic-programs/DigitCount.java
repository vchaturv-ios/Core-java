public class DigitCount {
    public static void main(String[] args) {
        int num = 123;
        int temp = num;
        int count = 0;
        while(num > 0) {
            count++;
            num = num/10;
        }

        System.out.println(String.format("Number %d has %d digits", temp, count));
    }
}
