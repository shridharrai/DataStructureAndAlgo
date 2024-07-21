public class GoldMine {
    public static void main(String[] args) {
        int row = 6;
        int col = 6;
        int[][] matrix = {
            {0, 1, 4, 2, 8, 2},
            {4, 3, 6, 5, 0, 4},
            {1, 2, 4, 1, 4, 6},
            {2, 0, 7, 3, 2, 2},
            {3, 1, 5, 9, 2, 4},
            {2, 7, 0, 8, 5, 1}
        };

        int max = maxGold(matrix, row, col);
        System.out.println(max);
    }

    public static int maxGold(int[][] matrix, int row, int col) {
        int[][] dp = new int[row][col];

        for(int j = col - 1; j >= 0; --j) {
            for(int i = 0; i < row; ++i) {
                if(j == col - 1) {
                    dp[i][j] = matrix[i][j];
                } else {
                    int digonallyUpMove = 0;
                    int horizontalMove = 0;
                    int digonallyDownMove = 0;

                    if(i - 1 >= 0) {
                        digonallyUpMove = dp[i - 1][j + 1];
                    }
                    if(i + 1 < row) {
                        digonallyDownMove = dp[i + 1][j + 1];
                    }
                    horizontalMove = dp[i][j + 1];

                    dp[i][j] = Math.max(Math.max(digonallyUpMove, horizontalMove), digonallyDownMove) + matrix[i][j];
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < row; ++i) {
            max = Math.max(max, dp[i][0]);
        }

        return max;
    }
}