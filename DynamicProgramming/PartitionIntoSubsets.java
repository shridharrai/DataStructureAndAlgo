public class PartitionIntoSubsets {
    public static void main(String[] args) {
        int noOfPeoples = 4;
        int teams = 3;

        int res = countWays(noOfPeoples, teams);
        System.out.println(res);
    }

    public static int countWays(int n, int k) {
        if(n == 0 || k == 0 || n < k) {
            return 0;
        }

        int[][] dp = new int[n + 1][k + 1];

        for(int i = 1; i < dp.length; ++i) {
            for(int j = 1; j < dp[i].length; ++j) {
                if(i < j) {
                    dp[i][j] = 0;
                } else if(i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j] * j;
                }
            }
        }

        return dp[n][k];
    }
}