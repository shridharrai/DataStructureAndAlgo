public class TargetSumSubset {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
        int target = 10;
        boolean res = isSubsetSum(arr, target);
        System.out.println(res);
    }

    public static boolean isSubsetSum(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length + 1][target];

        for(int i = 0; i < dp.length; ++i) {
            for(int j = 0; j < dp[i].length; ++j) {
                if(i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if(i == 0) {
                    dp[i][j] = false;
                } else if(j == 0) {
                    dp[i][j] = true;
                } else {
                    if(dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    } else {
                        int currentVal = arr[i - 1];
                        if(currentVal <= j) {
                            dp[i][j] = dp[i - 1][j - currentVal];
                        }
                    }
                }
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }
}