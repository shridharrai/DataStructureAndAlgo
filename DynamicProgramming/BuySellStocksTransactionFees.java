public class BuySellStocksTransactionFees {
    public static void main(String[] args) {
        int[] arr = {10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25};
        int fees = 3;

        int profit = calculateProfit(arr, fees);
        System.out.println(profit);
    }

    public static int calculateProfit(int[] arr, int fees) {
        int oldBuyStateProfit = -arr[0];
        int oldSellStateProfit = 0;

        for(int i = 1; i < arr.length; ++i) {
            int newBuyStateProfit = oldSellStateProfit - arr[i];
            int newSellStateProfit = oldBuyStateProfit + arr[i] - fees;

            if(newBuyStateProfit > oldBuyStateProfit) {
                oldBuyStateProfit = newBuyStateProfit;
            }
            if(newSellStateProfit > oldSellStateProfit) {
                oldSellStateProfit = newSellStateProfit;
            }
        }

        return oldSellStateProfit;
    }
}