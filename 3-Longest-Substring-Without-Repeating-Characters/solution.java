public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        int start = 0, end = 1;
        int res = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(start));
        while (end<s.length()){
            while (end<s.length() && !set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                res=Math.max(res,end-start);
            }
            set.remove(s.charAt(start));
            start++;
        }
        return res;
    }
}