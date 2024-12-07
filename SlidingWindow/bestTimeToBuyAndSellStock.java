class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        // int minPrice = Arrays.stream(prices).max().getAsInt();

        for (int i = 0; i < prices.length ; i++){
            minPrice = Math.min(minPrice, prices[i]);
            int Profit = prices[i]-minPrice;
            maxProfit = Math.max(Profit, maxProfit);
        } 
        return maxProfit;
    }
}