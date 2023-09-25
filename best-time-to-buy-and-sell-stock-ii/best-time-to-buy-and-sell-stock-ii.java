class Solution {
    private int n;
    private int[] dp ;
    public int maxProfit(int[] prices) {
        n=prices.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return getMax(prices,0);
    }

    public int getMax(int[] prices, int i){
        if(i==n){
            return 0;
        }
        if(dp[i]!=-1)
            return dp[i];

        int currentMax = 0;
        for(int j = i+1;j<n;j++){
            if(prices[j]-prices[i] > 0 ){
                currentMax = Math.max(currentMax, prices[j]-prices[i]+getMax(prices,j+1));
            }
        }


        return dp[i]=Math.max(currentMax,getMax(prices,i+1));
    }
}