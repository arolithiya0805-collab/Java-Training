package Day30;

import java.util.PriorityQueue;

public class Problem9 {

    public static void main(String[] args) {

        int[] ropes = {4, 3, 2, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int r : ropes)
            pq.add(r);

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

