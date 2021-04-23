package Numbers;

public class HappyNumber {

    private static int sumDigit(int num) {
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = (int) (sum + Math.pow(rem, 2));
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 28;
        int temp = num;
        while (num > 9) {
            num = sumDigit(num);
        }
        if (num == 1 || num == 7)
            System.out.println(temp + " is a Happy number");
        else
            System.out.println(temp + " is not a Happy number");

    }
}
