public class CoinChangePermutation {
    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        int amount = 7;
        int res = countPermutations(coins, amount);
        System.out.println(res);
    }

    public static int countPermutations(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        dp[0] = 1;
        for(int i = 1; i < dp.length; ++i) {
            for(int j = 0; j < coins.length; ++j) {
                int coin = coins[j];
                if(coin <= i) {
                    dp[i] = dp[i] + dp[i - coin];
                }
            }
        }

        return dp[amount];
    }
}