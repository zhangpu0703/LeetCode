public class Solution {
    public char findTheDifference(String s, String t) {
        int[] counts = new int[26];
        for (int i=0; i<s.length(); i++){
            counts[s.charAt(i)-'a']--;
            counts[t.charAt(i)-'a']++;
        }
        counts[t.charAt(s.length())-'a']++;
        char res = 'a';
        for (char c = 'a'; c<='z'; c++){
            if (counts[c-'a']==1) {
                res = c;
                break;
            }
        }
        return res;
    }
}