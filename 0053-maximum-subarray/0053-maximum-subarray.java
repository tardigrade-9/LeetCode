class Solution {
    public int maxSubArray(int[] nums) { 
        int n = nums.length;
        int sum[] = new int[n];
        sum[0] = nums[0];
        for(int i=1;i<n;i++)
            sum[i] = Math.max(sum[i-1]+nums[i],nums[i]);
        int ans = sum[0];
        for(int i=1;i<n;i++){
            ans = Math.max(ans,sum[i]);
        }
        
        return ans;
    }
}