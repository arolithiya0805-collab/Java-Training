package Day31;

public class Problem10 {
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;

        int[] dp = new int[W + 1];

        for (int i = 0; i < wt.length; i++)
            for (int j = W; j >= wt[i]; j--)
                dp[j] = Math.max(dp[j], dp[j - wt[i]] + val[i]);

        System.out.println(dp[W]);
    }
}