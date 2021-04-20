import java.util.Scanner;

public class EvenAndOddWihoutIf {
    public static void main(String[] args) {
        String[] arr = { "even", "odd" };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(String.format("%d is %s", number, arr[number % 2]));
        scanner.close();
    }
}
