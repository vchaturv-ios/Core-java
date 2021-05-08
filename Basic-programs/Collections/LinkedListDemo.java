package Collections;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDemo {
    public static void main(String[] args) {
        Set<String> myList = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            myList.add("String "+i);
        }
        System.out.println(myList);
    }
}
