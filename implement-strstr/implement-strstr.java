class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
            return -1;
        char[] ch = haystack.toCharArray();
        char[] cn = needle.toCharArray();
        int n = ch.length;
        int m = cn.length;
        int i =0,j=0;
        while(i+j<n && j<m){
            if(ch[i+j]==cn[j]){
                j++;
            }else{
                i=i+1;
                j=0;
            }
        }
        
        return j==m?i:-1;
    }
}