public class DecodeWays {
    public static void main(String[] args) {
        String str = "21123";
        int ways = countDecodingWays(str);
        System.out.println(ways);
    }

    public static int countDecodingWays(String str) {
        int[] dp = new int[str.length()];
        dp[0] = 1;

        for(int i = 1; i < dp.length; ++i) {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);

            if(currChar == '0' && prevChar == '0') {
                dp[i] = 0;
            } else if(currChar != '0' && prevChar == '0') {
                dp[i] = dp[i - 1];
            } else if(currChar == '0' && prevChar != '0') {
                String lastTwoChars = str.substring(i - 1, i + 1);
                if(Integer.parseInt(lastTwoChars) <= 26) {
                    dp[i] = ((i - 2) >= 0 ? dp[i - 2] : 1);
                }
            } else {
                String lastTwoChars = str.substring(i - 1, i + 1);
                if(Integer.parseInt(lastTwoChars) <= 26) {
                    dp[i] = dp[i - 1] + ((i - 2) >= 0 ? dp[i - 2] : 1);
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }

        return dp[str.length() - 1];
    }
}