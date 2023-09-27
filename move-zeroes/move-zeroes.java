class Solution {
    public void moveZeroes(int[] nums) {
        int[] moves = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                moves[i] = 0;
            }else{
                moves[i] = count;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i-moves[i]] = nums[i];
        }
        
        for(int i = nums.length-count;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}