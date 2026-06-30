class Solution {
    public int maxProfit(int[] prices) {
        int bestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            bestBuyPrice = Math.min(price, bestBuyPrice);
            maxProfit = Math.max(maxProfit, price - bestBuyPrice);
        }
        return maxProfit;
    }
}
