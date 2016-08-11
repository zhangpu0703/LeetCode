public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[256];
        for (int i = 0; i<magazine.length(); i++){
            map[magazine.charAt(i)]++;
        }
        for (int j = 0; j<ransomNote.length(); j++){
            if (map[ransomNote.charAt(j)]<=0) return false;
            map[ransomNote.charAt(j)]--;
        }
        return true;
    }
}