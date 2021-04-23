package Numbers;

public class Fibonacci {
    public static void main(String[] args) {
        //Program for fibonacci for first n terms
        //0,1,1,2,3,5,8
        int first_term = 40;
        int second_term = 1;
        //int num = 8;
        
        /*for(int i=0; i<num; i++) {
            int third_term = first_term+second_term;
            System.out.println(first_term);
            first_term = second_term;
            second_term = third_term;
        }*/

        //For a range between 0 to 100

        while(first_term < 50){
            int third_term = first_term+second_term;
            System.out.println(first_term);
            first_term = second_term;
            second_term = third_term;
        }
    }
}
