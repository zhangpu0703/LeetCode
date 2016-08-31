public class Solution {
    public char findTheDifference(String s, String t) {
        int[] counts = new int[26];
        for (int i=0; i<s.length(); i++){
            counts[s.charAt(i)-'a']--;
            counts[t.charAt(i)-'a']++;
        }
        counts[t.charAt(s.length())-'a']++;
        for (int i=0; i<26; i++){
            if (counts[i]>0) return (char) ('a'+i);
        }
        return '0';
    }
}