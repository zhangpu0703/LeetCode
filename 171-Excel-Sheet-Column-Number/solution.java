public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i=0; i<s.length(); i++){
            int cur = s.charAt(i)-'A'+1;
            res = res*26 + cur;
        }
        return res;
    }
}