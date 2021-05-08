package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(8);
        list.add(2);
        list.add(23);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();;
            if (value < 10)
                iterator.remove();
        }

        System.out.println(list);
    }
}
