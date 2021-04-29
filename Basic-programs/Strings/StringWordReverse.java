package Strings;

public class StringWordReverse {
    public static void main(String[] args) {
        String my_string = "This Is An Example String";
        System.out.println("First approach solution\n=======");
        System.out.println(reverseWords(my_string));
        System.out.println("Second approach solution\n=======");
        System.out.println(getReverseString(my_string));
    }

    // First approach
    private static String reverseWords(String my_string) {
        String[] words = my_string.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
    }

    // Second approach
    private static String getReverseString(String original_string) {
        String reverse_string = "";
        char[] char_array = original_string.toCharArray();
        for (int i = 0; i < char_array.length; i++) {
            int k = i;
            while (i < char_array.length && char_array[i] != ' ') {
                i++;
            }
            int j = i - 1;
            while (j >= k) {
                reverse_string = reverse_string + char_array[j];
                j--;
            }
            if (i < char_array.length) {
                reverse_string = reverse_string + char_array[i];
            }
        }
        return reverse_string;
    }
}
