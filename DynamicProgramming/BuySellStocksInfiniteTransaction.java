public class BuySellStocksInfiniteTransaction {
    public static void main(String[] args) {
        int[] arr = {11, 6, 7, 19, 4, 1, 6, 18, 4};
        int profit = calculateProfit(arr);
        System.out.println(profit);
    }

    public static int calculateProfit(int[] arr) {
        int buyingDay = 0;
        int sellingday = 0;
        int profit = 0;

        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] >= arr[i - 1]) {
                sellingday = i;
            } else {
                profit = profit + (arr[sellingday] - arr[buyingDay]);
                buyingDay = i;
                sellingday = i;
            }
        }

        profit = profit + (arr[sellingday] - arr[buyingDay]);
        return profit;
    }
}