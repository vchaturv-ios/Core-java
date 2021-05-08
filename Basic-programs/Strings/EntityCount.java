package Strings;

public class EntityCount {
    public static void main(String[] args) {
        String original_string = "A1E2I5O6Ucfdvs!@#$%";
        countEntityOccurance(original_string);
    }

    private static void countEntityOccurance(String original_string) {
        int vowel_count = 0, consonant_count = 0, digit_count = 0, special_character_count = 0;
        char[] character_array = original_string.toCharArray();

        for (int i = 0; i < character_array.length; i++) {
            if (character_array[i] >= 65 && character_array[i] <= 90 || character_array[i] >= 97 && character_array[i] <= 122) {
                if (character_array[i] == 'A' || character_array[i] == 'a' ||
                        character_array[i] == 'E' || character_array[i] == 'e' ||
                        character_array[i] == 'I' || character_array[i] == 'i' ||
                        character_array[i] == 'O' || character_array[i] == 'o' ||
                        character_array[i] == 'U' || character_array[i] == 'u')
                    vowel_count++;
                else
                    consonant_count++;
            } else if (character_array[i] >= 48 && character_array[i] <= 57)
                digit_count++;
            else
                special_character_count++;
        }
        System.out.println("Vowel count: "+vowel_count);
        System.out.println("Consonant count: "+consonant_count);
        System.out.println("Digit count: "+digit_count);
        System.out.println("Special character count: "+special_character_count);
    }
}
