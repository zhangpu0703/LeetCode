public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if (s.length() == 0) return 0;
        set.add(s.charAt(0));
        int start = 0, end = 1;
        int res = 1;
        while (end<s.length()){
            while (end<s.length() && !set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                res = Math.max(res,end-start+1);
                end++;
            }
            if (set.contains(s.charAt(start))){
                set.remove(s.charAt(start));
                start++;
            }
        }
        return res;
    }
}