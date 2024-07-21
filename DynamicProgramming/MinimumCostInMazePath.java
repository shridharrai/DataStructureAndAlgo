public class MinimumCostInMazePath {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[][] arr = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int cost = minCost(arr, n, m);
        System.out.println(cost);
    }

    public static int minCost(int[][] arr, int row, int col) {
        int[][] dp = new int[row][col];

        for(int i = dp.length - 1; i >= 0; --i) {
            for(int j = dp[i].length - 1; j >= 0; --j) {
                // last cell
                if(i == dp.length - 1 && j == dp[i].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if(i == dp.length - 1) {
                    // last row
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                } else if(j == dp[i].length - 1) {
                    // last col
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + arr[i][j];
                }
            }
        }

        return dp[0][0];
    }
}