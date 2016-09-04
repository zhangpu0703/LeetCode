public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) return false;
        HashSet<Character> used = new HashSet<Character>();
        HashMap<String,Character> sTop = new HashMap<String,Character>();
        for (int i=0; i<words.length; i++){
            if (!sTop.containsKey(words[i])){
                if (used.contains(pattern.charAt(i))) return false;
                sTop.put(words[i],pattern.charAt(i));
                used.add(pattern.charAt(i));
            }
            else{
                if (sTop.get(words[i])!=pattern.charAt(i)) return false;
            }
        }
        return true;
    }
}