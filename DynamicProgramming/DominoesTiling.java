public class DominoesTiling {
    public static void main(String[] args) {
        int n = 4;

        int res = tilingWays(n);
        System.out.println(res);
    }

    public static int tilingWays(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < dp.length; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}