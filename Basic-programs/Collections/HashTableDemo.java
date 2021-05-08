package Collections;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht1 = new Hashtable<String, Integer>();
        ht1.put("Vishnu", 100);
        ht1.put("Prachi", 200);
        ht1.put("Krishna", 300);
        ht1.put("Rahul", 400);
        ht1.put("Peter", 500);
        //ht1.put("Test", null);

        System.out.println(ht1.get("Vishnu"));


    }
}
