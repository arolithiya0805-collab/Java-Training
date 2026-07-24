package Day30;

import java.util.PriorityQueue;

public class Problem8 {

    public static void main(String[] args) {

        int[] freq = {5, 9, 12, 13, 16, 45};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int f : freq)
            pq.add(f);

        int cost = 0;

        while (pq.size() > 1) {

            int a = pq.poll();
            int b = pq.poll();

            cost += a + b;

            pq.add(a + b);
        }

        System.out.println("Minimum Cost = " + cost);
    }
}