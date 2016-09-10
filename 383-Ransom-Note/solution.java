public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[256];
        for (int i = 0; i<magazine.length(); i++){
            map[magazine.charAt(i)]++;
        }
        for (int j = 0; j<ransomNote.length(); j++){
            char cur = ransomNote.charAt(j);
            if (map[cur]==0) return false;
            map[cur]--;
        }
        return true;
    }
}