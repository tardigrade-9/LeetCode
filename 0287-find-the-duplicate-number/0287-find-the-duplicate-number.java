class Solution {
    public int findDuplicate(int[] nums) {
        boolean found[] = new boolean[nums.length+1];
        for(int num:nums){
            if(found[num])
                return num;
            found[num] = true;
        }
        return -1;
    }
}