class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        while(count++<nums.length){
          for(int i=0;i+1<nums.length;i++){
            if(nums[i]==0 && nums[i+1]!=0){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
                i++;
                }
            }  
        }
        
    }
}