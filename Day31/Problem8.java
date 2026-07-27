package Day31;

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int c : coins)
            for (int i = c; i <= amount; i++)
                dp[i] = Math.min(dp[i], dp[i-c] + 1);

        System.out.println(dp[amount] > amount ? -1 : dp[amount]);
    }
}