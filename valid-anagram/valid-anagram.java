class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] sCount = new int[26], tCount = new int[26];
        for(int i=0;i<sc.length;i++){
            sCount[sc[i]-'a']++;
            tCount[tc[i]-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(sCount[i]!=tCount[i])
                return false;
        }
        return true;
    }
}