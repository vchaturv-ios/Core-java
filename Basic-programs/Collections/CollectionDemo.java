package Collections;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        Vector<Integer> vector = new Vector<>();
        Hashtable<Integer, String> ht = new Hashtable<>();

        vector.add(1);
        vector.add(2);

        ht.put(1, "vishnu");
        ht.put(2, "is");
        ht.put(3, "Cool");

        System.out.println(arr[0]);
        System.out.println(vector.elementAt(0));
        System.out.println(ht.get(1));
    }
}
