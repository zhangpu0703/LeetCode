public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int digit = 1;
        for (int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            res+=(c-'A'+1)*digit;
            digit*=26;
        }
        return res;
    }
}