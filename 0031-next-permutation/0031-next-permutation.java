class Solution {
    public void nextPermutation(int[] nums) {
        int pivot;
        int n = nums.length;
        if(n==1)
            return;
        pivot = n-2;
        while(pivot >=0 ){
            if(nums[pivot] < nums[pivot+1])
                break;
            pivot--;
        }
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }
        //find the smallest number greater than nums[pivot]
        int smallest = pivot+1;
        while(smallest+1<n){
            if(nums[smallest+1] <= nums[pivot])
                break;
            smallest++;
        }
        
        swap(nums,pivot,smallest);
        reverse(nums,pivot+1,n-1);
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i++,j--);
        }
    }
}