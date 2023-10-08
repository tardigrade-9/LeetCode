class Solution {
    public boolean isPalindrome(String s) {
      char[] res  = new char[s.length()];
        int i=0;
      for(char ch: s.toCharArray()){
          if(Character.isLetterOrDigit(ch)){
              res[i++] = Character.toLowerCase(ch);
          }
      }
      int j = s.length()-1;
      for(;j>=0;j--){
          if(res[j]!=0)
              break;
      }
        if(j==-1)
            return true;
        i =0;
        while(i<j){
            if(res[i++]!=res[j--]){
                return false;
            }
        }
        return true;
    }
}