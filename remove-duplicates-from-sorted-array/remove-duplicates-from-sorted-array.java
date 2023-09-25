class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]==nums[i]){
                //its duplicate, just continue
                continue;
            }
            j++;
            swap(nums,i,j);
        }
        
        return j+1;
    }
    
    private void swap(int[]nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}