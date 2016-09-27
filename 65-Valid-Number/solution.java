public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.length()==0) return false;
        int ind = 0;
        if (s.charAt(ind)=='+' || s.charAt(ind)=='-') ind++;
        boolean numSeen = false;
        boolean eSeen = false;
        boolean dotSeen = false;
        while(ind<s.length()){
            char cur = s.charAt(ind);
            if (Character.isDigit(cur)){
                numSeen = true;
            }
            if (cur == '.'){
                if (dotSeen || eSeen) return false;
            }
            if (cur == 'e'){
                if (eSeen || !numSeen) return false;
            }
            if (cur == '+' || cur == '-'){
                if (ind==0 || s.charAt(ind-1) != 'e') return false;
            }
        }
        return numSeen;
    }
}