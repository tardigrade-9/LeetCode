class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] count = new int[26];
        for(int i=0;i<sc.length;i++){
            count[sc[i]-'a']++;
            count[tc[i]-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}