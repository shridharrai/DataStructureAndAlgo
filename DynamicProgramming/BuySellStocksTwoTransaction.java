public class BuySellStocksTwoTransaction {
    public static void main(String[] args) {
        int[] prices = {30, 40, 43, 50, 45, 20, 26, 40, 80, 50, 30, 15, 10, 20, 40, 45, 71, 50, 55};
        int profit = calculateProfit(prices);
        System.out.println(profit);
    }

    public static int calculateProfit(int[] prices) {
        // Traverse by considering each point as sell point and calculate max profit
        int maxProfitIfSellToday = 0;
        int leastSoFar = prices[0];
        int[] dpLeftMaxOfSell = new int[prices.length]; 
        for(int i = 1; i < prices.length; ++i) {
            if(prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }

            maxProfitIfSellToday = prices[i] - leastSoFar;
            if(maxProfitIfSellToday > dpLeftMaxOfSell[i - 1]) {
                dpLeftMaxOfSell[i] = maxProfitIfSellToday;
            } else {
                dpLeftMaxOfSell[i] = dpLeftMaxOfSell[i - 1];
            }
        }

        // Traverse from end by considering each point as buy point and calculate max
        int maxProfitIfBuyToday = 0;
        int maxTillNow = prices[prices.length - 1];
        int[] dpRightMaxOfBuy = new int[prices.length];
        for(int i = prices.length - 2; i >= 0; --i) {
            if(prices[i] > maxTillNow) {
                maxTillNow = prices[i];
            }

            maxProfitIfBuyToday = maxTillNow - prices[i];

            if(maxProfitIfBuyToday > dpRightMaxOfBuy[i + 1]) {
                dpRightMaxOfBuy[i] = maxProfitIfBuyToday;
            } else {
                dpRightMaxOfBuy[i] = dpRightMaxOfBuy[i + 1];
            }
        }

        int maxSum = 0;
        for(int i = 0; i < prices.length; ++i) {
            int sum = dpLeftMaxOfSell[i] + dpRightMaxOfBuy[i];
            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}