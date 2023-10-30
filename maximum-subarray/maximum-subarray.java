class Solution {
    public int maxSubArray(int[] nums) {
        int prevMax = nums[0];
        int max = prevMax;
        for(int i = 1;i<nums.length;i++){
            prevMax = Math.max(nums[i],nums[i]+prevMax);
            if(prevMax>max){
                max = prevMax;
            }
        }
        
        return max;
    }
}