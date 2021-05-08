package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>(5);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(null);
        set.add(null);
        set.add(1);
        set.add(2);

        System.out.println(set);
    }
}
