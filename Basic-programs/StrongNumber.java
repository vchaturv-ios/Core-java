public class StrongNumber {

    public static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        } else
            return 1;
    }

    public static boolean checkStrongNumber(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + factorial(rem);
            num = num / 10;
        }
        if (sum == temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int num = 145;
        if (checkStrongNumber(num))
            System.out.println(String.format("%d is a strong number", num));
        else
            System.out.println(String.format("%d is not a strong number", num));
    }

}
