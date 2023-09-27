class Solution {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        boolean neg = (x<0);
        String str = String.valueOf(x);
        if(neg){
            str = reverse(str.substring(1));
            str = "-"+str;
        }else{
            str = reverse(str);
        }
        
        try{
           return Integer.valueOf(str); 
        }catch(Exception e){
            return 0;
        }
        
    }
    
    private String reverse(String str){
        char[] rev = new char[str.length()];
        for(int i=0;i<rev.length;i++){
            rev[i] = str.charAt(rev.length-1-i);
        }
        
        return new String(rev);
    }
}