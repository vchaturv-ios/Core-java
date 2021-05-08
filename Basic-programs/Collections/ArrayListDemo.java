package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
            list.add(i + 1);

        System.out.println(list);

        list.add(null);
        list.add(null);
        list.add(5);

        System.out.println(list);
    }
}
