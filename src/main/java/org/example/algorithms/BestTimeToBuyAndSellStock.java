package org.example.algorithms;

public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStocks(int[] prices) {

        int high = prices[0];
        int low = high;
        int profit = high - low;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                if (high - low > profit) {
                    profit = high - low;
                }
                low = prices[i];
                high = low;
            } else if (prices[i] > high) {
                high = prices[i];
                if (high - low > profit) {
                    profit = high - low;
                }
            }
        }

        return profit;
    }
}
