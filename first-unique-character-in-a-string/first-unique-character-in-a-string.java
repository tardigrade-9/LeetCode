class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[26];
        for(char ch: chars){
            count[ch-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            if(count[chars[i]-'a']==1)
                return i;
        }
        
        return -1;
    }
}