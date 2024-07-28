public class PaintHouseManyColors {
    public static void main(String[] args) {
        int houses = 4;
        int colors = 6;
        int[][] arr = {
            {1, 5, 7, 2, 1, 4},
            {5, 8, 4, 3, 6, 1},
            {3, 2, 9, 7, 2, 3},
            {1, 2, 4, 9, 1, 7}
        };

        // long cost = minCost(houses, colors, arr);
        long cost = minCostOptimized(houses, colors, arr);
        System.out.println(cost);
    }

    // n3 complexity
    public static long minCost(int rows, int cols, int[][] arr) {
        long[][] dp = new long[rows][cols];

        for(int i = 0; i < dp.length; ++i) {
            for(int j = 0; j < dp[i].length; ++j) {
                if(i == 0) {
                    dp[i][j] = arr[i][j];
                } else {
                    long min = Long.MAX_VALUE;
                    for(int k = 0; k < dp[i].length; ++k) {
                        if(k != j) {
                            min = Math.min(dp[i - 1][k], min);
                        }
                    }

                    dp[i][j] = arr[i][j] + min;
                }
            }
        }

        long min = dp[rows - 1][0];
        for(int j = 1; j < dp[0].length; ++j) {
            min = Math.min(dp[rows - 1][j], min);
        }

        return min;
    }

    public static long minCostOptimized(int rows, int cols, int[][] arr) {
        long[][] dp = new long[rows][cols];
        long firstMin = Long.MAX_VALUE;
        long secondMin = Long.MAX_VALUE;

        // For first row(house)
        for(int j = 0; j < dp[0].length; ++j) {
            dp[0][j] = arr[0][j];

            if(dp[0][j] < firstMin) {
                secondMin = firstMin;
                firstMin = dp[0][j];
            } else if(dp[0][j] < secondMin) {
                secondMin = dp[0][j];
            }
        }

        // For remaining rows(houses)
        for(int i = 1; i < dp.length; ++i) {
            long newFirstMin = Long.MAX_VALUE;
            long newSecondMin = Long.MAX_VALUE;
            for(int j = 0; j < dp[i].length; ++j) {
                if(dp[i - 1][j] != firstMin) {
                    dp[i][j] = arr[i][j] + firstMin;
                } else {
                    dp[i][j] = arr[i][j] + secondMin;
                }

                if(dp[i][j] < newFirstMin) {
                    newSecondMin = newFirstMin;
                    newFirstMin = dp[i][j];
                } else if(dp[i][j] < newSecondMin) {
                    newSecondMin = dp[i][j];
                }
            }

            firstMin = newFirstMin;
            secondMin = newSecondMin;
        }

        return firstMin;
    }
}