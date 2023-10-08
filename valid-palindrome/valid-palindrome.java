class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char lc = s.charAt(l), rc = s.charAt(r);
            if (!isAlphanumeric(lc)) {
                l++;
            } else if (!isAlphanumeric(rc)) {
                r--;
            } else if (!equals(lc, rc)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
    
    private boolean isAlphanumeric(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }
    
    private boolean equals(char x, char y) {
        return Character.toLowerCase(x) == Character.toLowerCase(y);
    }
}