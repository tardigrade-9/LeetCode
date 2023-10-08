class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String minStr="";
        for(String str :strs){
            if(min>str.length()){
                min = str.length();
                minStr = str;
            }
        }
        boolean found = false;
        int maxIdx = -1;
        for(int j=0;j<min;j++){
            for(int i=0;i<strs.length;i++){
                if(strs[i].charAt(j)!=minStr.charAt(j)){
                  found = true; 
                  break;
                }
            }
            if(found)
                break;
            maxIdx = j;
        }
        if(maxIdx == -1)
            return "";
        return minStr.substring(0,maxIdx+1);
    }
}