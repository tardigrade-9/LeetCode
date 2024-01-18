class Solution {
    public void sortColors(int[] nums) {
        // using Dutch Flag algorithm
        int low, mid, high;
        low = 0;
        mid = 0;
        high = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[mid] == 0){
                swap(nums,low++,mid++);
            }else if(nums[mid] == 1){
                mid++;
            }else {
                swap(nums,high--,mid);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}