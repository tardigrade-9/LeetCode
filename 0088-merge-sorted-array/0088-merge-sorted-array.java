class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];
        int k = 0,i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                sorted[k++] = nums1[i++];
            }else{
                sorted[k++] = nums2[j++];
            }
        }
        
        while(i<m){
            sorted[k++] = nums1[i++];
        }
        while(j<n){
            sorted[k++] = nums2[j++];
        }
        
        for(i=0;i<m+n;i++){
            nums1[i] = sorted[i];
        }
    }
}