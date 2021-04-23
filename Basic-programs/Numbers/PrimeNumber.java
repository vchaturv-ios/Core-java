package Numbers;

public class PrimeNumber {
    // Prime Numer is divisible by 1 and only itself
    public static boolean checkPrimeNumber(int num) {
        int i = 2;
        boolean isPrime = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                break;
            }
            i++;
        }
        if(i>num/2)
        isPrime = true;
        else isPrime = false;
        return isPrime;
    }

    public static void main(String[] args) {
        int num = 29;
        if (checkPrimeNumber(num))
            System.out.println(String.format("%d is prime", num));
        else
            System.out.println(String.format("%d is not a prime", num));
    }

}
