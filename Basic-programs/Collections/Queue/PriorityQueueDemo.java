package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo<E> extends PriorityQueue<E> {
    @Override
    public boolean offer(E e) {
        boolean isAdded = false;
        if(!super.contains(e)) {
            isAdded = super.offer(e);
        }
        return isAdded;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(2);

        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(1);

        for (int i = 0; i <= 2; i++) {
            System.out.println(pQueue.poll());
        }

    }
}
