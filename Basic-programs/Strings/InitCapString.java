package Strings;

public class InitCapString {
    public static void main(String[] args) {
        String string = "mY nAmE iS ViShnu";
        System.out.println(initCap(string));

    }

    public static String initCap(String string) {
        char[] character_array = string.toCharArray();
        for (int i = 0; i < character_array.length; i++) {
            if (character_array[i] >= 97 && character_array[i] <= 122)
                character_array[i] = (char) (character_array[i] - 32);
            else if (character_array[i] >= 65 && character_array[i] <= 90)
                character_array[i] = (char) (character_array[i] + 32);
        }
        String modified_String = "";
        for (int i = 0; i < character_array.length; i++) modified_String = modified_String + character_array[i];
        return modified_String;
    }
}
