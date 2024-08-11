import java.util.HashMap;

public class HighWayBillBoard {
    public static void main(String[] args) {
        int totalMiles = 20;
        int[] boards = {6, 8, 12, 14, 16};
        int[] revenue = {5, 8, 5, 3, 1};
        int gap = 3;

        // int profit = calculateProfit(boards, revenue, gap);
        int profit = calculateProfit2(boards, revenue, gap, totalMiles);
        System.out.println(profit);
    }

    //O(n2), n -> boards.length
    public static int calculateProfit(int[] boards, int[] revenue, int gap) {
        int[] dp = new int[boards.length];
        dp[0] = revenue[0];
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 1; i < dp.length; ++i) {
            int maxProfitOfPrev = 0;
            for(int j = 0; j < i; ++j) {
                if(boards[i] - boards[j] > gap) {
                    maxProfitOfPrev = Math.max(maxProfitOfPrev, dp[j]);
                }
            }

            dp[i] = maxProfitOfPrev + revenue[i];
            maxProfit = Math.max(maxProfit, dp[i]);
        }

        return maxProfit;
    }

    // O(m), m -> totalMiles
    public static int calculateProfit2(int[] boards, int[] revenue, int gap, int totalMiles) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < boards.length; ++i) {
            map.put(boards[i], revenue[i]);
        }

        int[] dp = new int[totalMiles + 1];
        dp[0] = 0;

        for(int i = 1; i < dp.length; ++i) {
            if(map.containsKey(i)) {
                int currBoardNotInstalled = dp[i - 1];
                int currBoardInstalled = map.get(i); 
                if(i >= gap + 1) { // so that dp index doesn't go out of bound i.e. -ve
                    currBoardInstalled = currBoardInstalled + dp[i - gap - 1];
                }
                dp[i] = Math.max(currBoardInstalled, currBoardNotInstalled);
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[totalMiles];
    }
}