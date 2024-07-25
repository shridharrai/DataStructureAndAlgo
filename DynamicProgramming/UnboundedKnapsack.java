public class UnboundedKnapsack {
    public static void main(String[] args) {
        int n = 5;
        int[] values = {15, 14, 10, 45, 30};
        int[] weights = {2, 5, 1, 3, 4};
        int maxCapacity = 7;

        int res = knapsack(n, maxCapacity, values, weights);
        System.out.println(res);
    }

    public static int knapsack(int n, int maxCapacity, int[] values, int[] weights) {
        int[] dp = new int[maxCapacity + 1];
        dp[0] = 0;

        for(int i = 1; i < dp.length; ++i) {
            for(int j = 0; j < n; ++j) {
                int currentWeight = weights[j];
                int currentVal = values[j];

                if(currentWeight <= i) {
                    int totalVal = currentVal + dp[i - currentWeight];
                    dp[i] = Math.max(dp[i], totalVal);
                }
            }
        }

        return dp[maxCapacity];
    }
}