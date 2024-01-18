class Solution {
    public int maxSubArray(int[] nums) { 
//         int n = nums.length;
//         int sum[] = new int[n];
//         sum[0] = nums[0];
//         for(int i=1;i<n;i++)
//             sum[i] = Math.max(sum[i-1]+nums[i],nums[i]);
//         int ans = sum[0];
//         for(int i=1;i<n;i++){
//             ans = Math.max(ans,sum[i]);
//         }
        
//         return ans;
        //using Kadane's algorithm
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}