class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)
            return 0;
        int profit = 0;
        int l = 0;
        int r = 1;
        for(;r<prices.length;r++){
            if(prices[r]>prices[l]){
                profit = Math.max(prices[r]-prices[l],profit);
            }else{
                l = r;
            }
            
        }
        return profit;
    }
}