package Numbers;

import java.util.Scanner;

public class DecimalToBinary {
    public static String getBinaryRepresentation(int num) {
        if (num > 0) {
            int rem = num % 2;
            num = num / 2;
            return getBinaryRepresentation(num) + rem;
        } else
            return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int num = scanner.nextInt();
        System.out.println(String.format("Binary representation for %d is %s", num, getBinaryRepresentation(num)));
        scanner.close();
    }
}
