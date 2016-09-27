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
            else if (cur == '.'){
                if (dotSeen || eSeen) return false;
                dotSeen = true;
            }
            else if (cur == 'e'){
                if (eSeen || !numSeen) return false;
                numSeen = false;
            }
            else if (cur == '+' || cur == '-'){
                if (ind==0 || s.charAt(ind-1) != 'e') return false;
            }
            else return false;
            ind++;
        }
        return numSeen;
    }
}