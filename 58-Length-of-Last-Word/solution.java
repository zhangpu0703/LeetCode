public class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] strs = s.split(" ");
        if (strs.length==0) return 0;
        else return strs[strs.length-1].length();
    }
}