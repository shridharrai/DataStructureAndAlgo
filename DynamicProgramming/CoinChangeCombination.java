public class CoinChangeCombination {
    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        int amount = 7;

        int res = countCombinations(coins, amount);
        System.out.println(res);
    }

    public static int countCombinations(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for(int i = 0; i < coins.length; ++i) {
            int coin = coins[i];
            for(int j = coin; j < dp.length; ++j) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }

        return dp[amount];
    }
}