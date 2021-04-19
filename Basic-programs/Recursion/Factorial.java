package Recursion;

public class Factorial {
    //With recusrion
    public static int factorialWithRecursion(int num) {
        if(num > 1) {
            return num*factorialWithRecursion(num-1);
        }
        else return 1;
    }

    public static int factorialWithoutRecursion(int num) {
        int fact = 1;
        while(num > 0) {
            fact = fact*num;
            num--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int result = factorialWithRecursion(7);
        int result1 = factorialWithoutRecursion(8);
        System.out.println("*******Factorial with recusrion*******");
        System.out.println(result);
        System.out.println("*******Factorial without recusrion*******");
        System.out.println(result1);
    }
    
}
