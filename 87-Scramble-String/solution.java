public class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        int n = s1.length();
        for (int i=0; i<n; i++){
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;
        }
        for (int i=0; i<26; i++){
            if (map1[i]!=map2[i]) return false;
        }
        for (int i=1; i<s1.length(); i++){
            if (isScramble(s1.substring(0,i),s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i))){
              return true;  
            } 
            else if (isScramble(s1.substring(0,i),s2.substring(n-i)) && isScramble(s2.substring(0,n-i),s1.substring(i))) return true;
        }
        return false;
    }
}