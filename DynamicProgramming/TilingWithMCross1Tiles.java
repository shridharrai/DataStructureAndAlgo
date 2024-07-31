public class TilingWithMCross1Tiles {
    public static void main(String[] args) {
        int m = 3;
        int n = 8;

        int res = countWays(m, n);
        System.out.println(res);
    }

    public static int countWays(int m, int n) {
        int[] dp = new int[n + 1];

        for(int i = 1; i < dp.length; ++i) {
            if(i < m) {
                dp[i] = 1;
            } else if(i == m) {
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }

        return dp[n];
    }
}