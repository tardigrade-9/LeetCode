class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--){
            result[i+1] = (digits[i]+carry)%10;
            carry = (digits[i] + carry)/10;
        }
        if(carry == 1){
            result[0] = 1;
            return result;
        }
        return Arrays.copyOfRange(result,1,result.length);
    }
}