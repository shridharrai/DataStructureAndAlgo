public class FriendsPairing {
    public static void main(String[] args) {
        int n = 5;

        int result = countPairs(n);
        System.out.println(result);
    }

    public static int countPairs(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < dp.length; ++i) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }

        return dp[n];
    }
}