package Day31;

public class Problem7 {
    public static void main(String[] args) {
        int[] cost = {10,15,20};

        for (int i = 2; i < cost.length; i++)
            cost[i] += Math.min(cost[i-1], cost[i-2]);

        System.out.println(Math.min(cost[cost.length-1], cost[cost.length-2]));
    }
}