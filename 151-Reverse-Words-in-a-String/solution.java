public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strs = s.split("\\s+");
        String res = "";
        for (int i=strs.length-1; i>=0; i--){
            res = res+strs[i];
            if (i>0) res = res+" ";
        }
        return res;
    }
}