public class BuySellStocksCoolDown {
    public static void main(String[] args) {
        int[] arr = {10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25};
        int profit = calculateProfit(arr);
        System.out.println(profit);
    }

    public static int calculateProfit(int[] arr) {
        int oldBuyStateProfit = -arr[0];
        int oldSellStateProfit = 0;
        int oldCoolDownStateProfit = 0;

        for(int i = 1; i < arr.length; ++i) {
            int newBuyStateProfit = oldCoolDownStateProfit - arr[i];
            int newSellStateProfit = oldBuyStateProfit + arr[i];
            int newCoolDownStateProfit = oldSellStateProfit;

            if(newBuyStateProfit > oldBuyStateProfit) {
                oldBuyStateProfit = newBuyStateProfit;
            }
            if(newSellStateProfit > oldSellStateProfit) {
                oldSellStateProfit = newSellStateProfit;
            }
            if(newCoolDownStateProfit > oldCoolDownStateProfit) {
                oldCoolDownStateProfit = newCoolDownStateProfit;
            }
        }

        return oldSellStateProfit;
    }
}