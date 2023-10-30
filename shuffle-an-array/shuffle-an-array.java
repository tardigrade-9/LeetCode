class Solution {
    private int[] original,shuffled;
    private Random rand = new Random();
    private int n;
    public Solution(int[] nums) {
        this.original = nums;
        this.shuffled = Arrays.copyOf(nums,nums.length);
        this.n = nums.length;
    }
    
    public int[] reset() {
        return this.original;
    }
    
    public int[] shuffle() {
        for(int i=0;i<n;i++){
            int idx1 = rand.nextInt(n);
            int temp = shuffled[idx1];
            shuffled[idx1] = shuffled[i];
            shuffled[i]= temp;
        }
        return this.shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */