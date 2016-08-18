public class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==0) return "";
        int len = 1;
        String res = s.substring(0,1);
        for (int i=0; i<s.length(); i++){
            for (int j=i+len; j<s.length(); j++){
                String cur = s.substring(i,j+1);
                if (cur.length()>len && isPal(cur)) {
                    len = cur.length();
                    res = cur;
                }
            }
        }
        return res;
    }
    public boolean isPal(String s){
        int halfLen = s.length()/2;
        for (int i=0; i<halfLen; i++){
            if(s.charAt(s.length()-i-1) != s.charAt(i)) return false; 
        }
        return true;
    }
}