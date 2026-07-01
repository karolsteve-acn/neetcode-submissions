class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(var p : prices) {
            minPrice = Math.min(minPrice, p);
            var profit = p - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
