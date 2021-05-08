package Numbers;

public class BeautifulNumbers {
    public static void main(String[] args) {
        int numL = 31;
        int numR = 32;

        int result = getResult(numL);
        int sum = 0;
        int final_value = 0;

        while(result > 0) {
           /*int rem = result%10;
           sum = sum+(rem*rem);
           result = result/10;*/
            final_value = getResult(result);
            result = result/10;
        }

        int value = 0;
        if(sum == 1) {
            value = numL+numR;
        }
        else {
            value = numL;
        }



    }

    public static int getResult(int numL) {
        int sum = 0;

        while(numL > 0) {
            int rem = numL%10;
            sum = sum+(rem*rem);
            numL = numL/10;
        }
        return sum;
    }
}
