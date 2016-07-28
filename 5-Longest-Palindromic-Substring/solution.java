public class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==0) return "";
        String res = "";
        for (int i=0; i<s.length(); i++){
            int left = i, right = i;
            while (right<s.length()-1 && s.charAt(right)==s.charAt(right+1)) right++;
            while (left>0 && right<s.length()-1 && s.charAt(left-1)==s.charAt(right+1)){
                left--;
                right++;
            }
            if (res.length()<right-left+1){
                res = s.substring(left,right+1);
            }
        }
        return res;
    }
}