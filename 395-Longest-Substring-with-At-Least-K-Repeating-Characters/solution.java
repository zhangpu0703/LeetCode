public class Solution {
    public int longestSubstring(String s, int k) {
        if(s==null || s.length()==0) return 0;
        int[] counts = new int[26];
        for(int i=0; i<s.length(); i++){
            counts[s.charAt(i)-'a']++;
        }
        char notIn = 'a';
        boolean ok = true;
        for (char ch = 'a'; ch<='z'; ch++){
            if (counts[ch-'a']!=0 && counts[ch-'a']<k){
                notIn = ch;
                ok = false;
                break;
            }
        }
        if (ok) return s.length();
        String[] strs = s.split(Character.toString(notIn));
        int max = 0;
        for (int i=0; i<strs.length; i++){
            max = Math.max(max,longestSubstring(strs[i],k));
        }
        return max;
    }
}