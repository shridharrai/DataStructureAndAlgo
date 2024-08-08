public class BuySellStocksOneTransaction {
    public static void main(String[] args) {
        int[] arr = {11, 6, 7, 19, 4, 1, 6, 18, 4};
        int res = maxProfitPair(arr);
        System.out.println(res);
    }

    public static int maxProfitPair(int[] arr) {
        int leastSoFar = Integer.MAX_VALUE;
        int maxProfitSoFar = 0;

        for(int i = 0; i < arr.length; ++i) {
            leastSoFar = Math.min(arr[i], leastSoFar);
            
            int profit = arr[i] - leastSoFar;
            maxProfitSoFar = Math.max(maxProfitSoFar, profit);
        }

        return maxProfitSoFar;
    }
}