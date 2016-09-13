public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i<s.length()){
            if (j<t.length()){
                if (t.charAt(j) == s.charAt(i)) i++;
                j++;
            }
            else break;
        }
        return i==s.length();
    }
}