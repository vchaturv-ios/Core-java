package Numbers;

public class NumberReverse {
    public static void main(String[] args) {
        // 843 -> 348
        int num  = 843;
        int temp = num;
        int rev = 0;
        while(temp > 0) {
            int rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }

        System.out.println("****Original number****");
        System.out.println(num);
        System.out.println("****Reverse number****");
        System.out.println(rev);

    }
}
