class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++ ){
            for (int k = i; k <nums.length;k++){           
                if(nums[k] + nums[k-i] == target){
                    int[] answer = {k-i,k};
                    return answer;
                }
                
            }
        }
        return null;
    }
}