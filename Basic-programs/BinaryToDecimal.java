public class BinaryToDecimal {

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int getPowerValue(int num, int pow) {
        int p = 1;
        while (pow > 0) {
            p = num * p;
            pow--;
        }
        return p;
    }

    public static void main(String[] args) {
        int num = 101101;
        int sum = 0, n = 0;

        while (num >= 0) {
            if (num == 0) {
                break;
            } else {
                int temp = num % 10;
                sum = sum + (temp * getPowerValue(2, n));
                n++;
                num = num / 10;
            }
        }
        System.out.println("Decimal Representation: " + sum);
    }
}
