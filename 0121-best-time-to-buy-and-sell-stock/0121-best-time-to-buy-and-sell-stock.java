class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit = 0;
        for(int price:prices){
            profit = Math.max(profit,price-low);
            low = Math.min(low,price);
        }
        return profit;
    }
}