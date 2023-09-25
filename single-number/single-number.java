class Solution {
        public int singleNumber(int[] nums) {
        int a = 0;
        //bit manipulation
        for(int num:nums){
            a = a^num;
        }
        return a;
    }
}