public class BuySellStocksKTransactions {
    public static void main(String[] args) {
        int[] prices = {9, 6, 7, 6, 3, 8};
        int transactions = 3;

        // int profit = calculateProfit(prices, transactions);
        int profit = calculateProfitOptimized(prices, transactions);
        System.out.println(profit);
    }

    // O(n3)
    public static int calculateProfit(int[] prices, int transactions) {
        int[][] dp = new int[transactions + 1][prices.length];

        for(int transaction = 1; transaction < dp.length; ++transaction) {
            for(int day = 1; day < dp[transaction].length; ++day) {
                int max = dp[transaction][day - 1];
                for(int previousDay = 0; previousDay < day; ++previousDay) {
                    int previousDayProfit = dp[transaction - 1][previousDay];
                    int currBuySellProfit = prices[day] - prices[previousDay];

                    int totalProfit = previousDayProfit + currBuySellProfit;
                    if(totalProfit > max) {
                        max = totalProfit;
                    }
                }

                dp[transaction][day] = max;
            }
        }

        return dp[transactions][prices.length - 1];
    }

    // O(n2)
    public static int calculateProfitOptimized(int[] prices, int transactions) {
        int[][] dp = new int[transactions + 1][prices.length];

        for(int transaction = 1; transaction < dp.length; ++transaction) {
            int maxProfitOfPreviousDays = Integer.MIN_VALUE;
            for(int day = 1; day < dp[0].length; ++day) {
                int temp = dp[transaction - 1][day - 1] - prices[day - 1];
                if(temp > maxProfitOfPreviousDays) {
                    maxProfitOfPreviousDays = temp;
                }

                int currPrevDaysProfit = maxProfitOfPreviousDays + prices[day];
                int previousDayProfitWithCompleteTransaction = dp[transaction][day - 1];
                if(previousDayProfitWithCompleteTransaction < currPrevDaysProfit) {
                    dp[transaction][day] = currPrevDaysProfit;
                } else {
                    dp[transaction][day] = previousDayProfitWithCompleteTransaction;
                }
            }
        }

        return dp[transactions][prices.length - 1];
    }
}