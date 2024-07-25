public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int n = 5;
        int[] values = {15, 14, 10, 45, 30};
        int[] weights = {2, 5, 1, 3, 4};
        int maxCapacity = 7;

        int res = knapsack(n, maxCapacity, values, weights);
        System.out.println(res);
    }

    public static int knapsack(int n, int maxCapacity, int[] values, int[] weights) {
        int[][] dp = new int[n + 1][maxCapacity + 1];

        for(int i = 0; i < dp.length; ++i) {
            for(int j = 0; j < dp[i].length; ++j) {
                if(i == 0) {
                    dp[i][j] = 0;
                } else if(j == 0) {
                    dp[i][j] = 0;
                } else {
                    int valWithoutInc = dp[i - 1][j];
                    int valAfterInc = 0;
                    int currentWeight = weights[i - 1];
                    int currentVal = values[i - 1];

                    if(currentWeight <= j) {
                        valAfterInc = dp[i - 1][j - currentWeight] + currentVal;
                    }

                    dp[i][j] = Math.max(valWithoutInc, valAfterInc);
                }
            }
        }

        return dp[n][maxCapacity];
    }
}