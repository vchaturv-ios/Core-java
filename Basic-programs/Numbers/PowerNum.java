package Numbers;

import java.util.Scanner;

public class PowerNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Enter power: ");
        int p = scanner.nextInt();

        int k = p;

        int pow = 1;

        while (p > 0) {
            pow = pow * num;
            p--;
        }

        System.out.println(String.format("%d with power of %d is %d", num, k, pow));
        scanner.close();
    }
}
