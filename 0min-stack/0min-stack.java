class MinStack {
    int[] nums = new int[8];
    int top = -1;
    int minIdx=0;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top==nums.length-1){
            nums = Arrays.copyOf(nums,2*top+2);
            
        }
        System.out.println(nums.length);
        nums[++top] = val;
        if(nums[minIdx]>val){
            minIdx = top;
        }
    }
    
    public void pop() {
        if(top == nums.length/4 && top >4 ){
            int[] temp = new int[2*top];
            temp = Arrays.copyOf(nums,top);
            nums = temp;
        }
        top--;
        if(minIdx>top){
            calculateMin();
        }
    }
    
    public int top() {
        return nums[top];
    }
    
    public int getMin() {
        System.out.println(minIdx+" "+top);
        return nums[minIdx];
    }
    
    private void calculateMin(){
        minIdx = 0;
        for(int i=1;i<=top;i++){
            if(nums[minIdx]>nums[i]){
                minIdx = i;
            }
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */