class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;
        double pow = Math.log(n)/Math.log(3);
        if(Math.abs(pow - Math.round(pow))<1e-10)
            return true;
        return false;
    }
}