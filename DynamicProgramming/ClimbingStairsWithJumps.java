public class ClimbingStairsWithJumps {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 3, 0, 2, 2, 3};
        
        int totalPaths = countPathsTabulation(n, arr);
        System.out.println(totalPaths);
    }

    public static int countPathsTabulation(int n, int[] arr) {
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n - 1; i >= 0; --i) {
            for(int j = 1; j <= arr[i] && i + j < dp.length; ++j) {
                dp[i] = dp[i] + dp[i + j];
            }
        }

        return dp[0];
    }
}