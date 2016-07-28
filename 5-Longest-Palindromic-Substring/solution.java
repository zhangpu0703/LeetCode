public class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        String res = "";
        int left = 0;
        int right = 0;
        for (int i=0; i<s.length(); i++){
            left = i;
            right = i;
            while (right<s.length()-1 && s.charAt(right+1) == s.charAt(right)) right++;
            while (left>0 && right<s.length()-1 && s.charAt(left-1)==s.charAt(right+1)){
                left--;
                right++;
            }
            if (len < right - left+1){
                res = s.substring(left,right+1);
                len = right - left +1 ;
            }
        }
        return res;
    }
}