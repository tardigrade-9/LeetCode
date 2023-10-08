class Solution {
    public int myAtoi(String s) {
        int res = 0;
        boolean negative = false;
        char[] sch = s.toCharArray();
        int i = 0;
        for(;i<sch.length;i++){
            if(sch[i]!=' ')
                break;
        }
        
        //found first no white space char
        // check if it's a sign
        if(i==sch.length)
            return 0;
        if(sch[i]=='-'){
            negative = true;
            i++;
        }
        else if(sch[i]=='+'){
            negative = false;
            i++;
        }
        if(i == sch.length){
            return 0;
        }
        
        while(i<sch.length){
            
            int p = (int)sch[i++]-'0';
            if(p<0 || p>9)
                break;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && p > 7)){
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            
            res = res*10+p;
        }
        
        return negative?res*(-1):res;
    }
}