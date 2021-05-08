package Strings;

public class CharacterCount {
    public static void main(String[] args) {
        String string = "This is a sample string";
        char[] character_array = string.toCharArray();
        int word_count = 0;
        for (int i = 0; i < character_array.length; i++) {
            if ((i == 0 && character_array[i] != ' ') ||
                    (character_array[i] != ' ' && character_array[i - 1] == ' '))
                word_count++;
        }

        System.out.println("Total number of words in this sentence: " + word_count);
    }
}
