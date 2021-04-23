import java.util.Scanner;

public class PerfectNumber {

    public static void checkPerfect(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum = sum + i;
            }

            i++;

        }
        if (sum == num)
            System.out.println("Number is perfect");
        else
            System.out.println("Number is not perfect");
    }

    public static void main(String[] args) {
        // 28 is a perfect number,
        // 1+2+4+7+14=28
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        checkPerfect(num);
        sc.close();

    }
}
