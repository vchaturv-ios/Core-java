package Arrays;

import java.util.*;

public class CountElements {
    public static void main(String[] args) {
        int[] integer_array = {1, 2, 1, 2, 3, 3, 1, 2, 4, 4, 3};

        //First approach
        countElements1(integer_array);
        countElements2(integer_array);
    }

    private static void countElements2(int[] integer_array) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < integer_array.length; i++) {
            if (countMap.containsKey(integer_array[i])) {
                int count = countMap.get(integer_array[i]);
                countMap.put(integer_array[i], count++);
            }
            else
                countMap.put(integer_array[i], 1);
        }

        countMap.forEach((key, value) -> {
            System.out.println(key + " occurs " + value + " time(s)");
        });
    }

    private static void countElements1(int[] integer_array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < integer_array.length; i++) {
            set.add(integer_array[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            ;
            int count = 0;
            for (int j = 0; j < integer_array.length; j++) {
                if (value == integer_array[j]) {
                    count++;
                }
            }
            System.out.println(String.format("%d has count of %d", value, count));
        }
    }
}
