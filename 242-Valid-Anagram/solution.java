public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] smap = new int[26];
        if (s.length() != t.length()) return false;
        for (int i=0; i<s.length(); i++){
            smap[s.charAt(i)-'a']++;
            smap[t.charAt(i)-'a']--;
        }
        for (int num : smap){
            if (num != 0) return false;
        }
        return true;
    }
}