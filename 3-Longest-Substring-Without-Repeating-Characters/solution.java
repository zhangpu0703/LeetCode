public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        if (s==null || s.length()==0) return 0;
        set.add(s.charAt(0));
        int left = 0, right = 1;
        int len = 1;
        while (right<s.length()){
            while (right<s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                len = Math.max(len,right-left);
            }
            if (set.contains(s.charAt(left))) {
                set.remove(s.charAt(left++));
            }
            
        }
        return len;
    }
}