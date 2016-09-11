public class Solution {
    public String longestPalindrome(String s) {
        if (s==null || s.length()==0) return "";
        int len = 1;
        String res = s.substring(0,1);
        for (int i=0; i<s.length(); i++){
            int left = i, right = i;
            while (right<s.length()-1 && s.charAt(right+1) == s.charAt(i)) right++;
            while (left>0 && right<s.length()-1 && s.charAt(left-1)==s.charAt(right+1)){
                left--;
                right++;
            }
            if (right-left+1>len){
                len = right-left+1;
                res = s.substring(left,right+1);
            }
        }
        return res;
    }
}