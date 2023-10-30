class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length+1];
        int max = Integer.MIN_VALUE;
        
        for(int i =1;i<nums.length+1;i++){
            dp[i] = Math.max(nums[i-1],nums[i-1]+dp[i-1]);
            if(dp[i]>max){
                max = dp[i];
            }
        }
        
        return max;
    }
}