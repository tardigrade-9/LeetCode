class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for(int num:nums1){
            count[num]++;
        }
        int k =0;
        int[] result = new int[Math.min(nums1.length,nums2.length)];
        for(int num:nums2){
            if(count[num]>0){
                result[k++] = num;
                count[num]--;
            }
        }
        
        return Arrays.copyOfRange(result,0,k);
    }
}