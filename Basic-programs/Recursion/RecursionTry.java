package Recursion;
public class RecursionTry {
    public static void heloWorld(String heloWorld, int num) {
        if(num>0) {
            System.out.println(heloWorld);
            heloWorld(heloWorld, num-1);
        }  
    }    
    public static void main(String[] args) {
        heloWorld("Hello World", 5);
    }
}
