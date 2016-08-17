public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        HashMap<String,Character> map = new HashMap<String,Character>();
        Set<Character> set = new HashSet<>();
        if (strs.length != pattern.length()) return false;
        for (int i=0; i<strs.length; i++){
            String s = strs[i];
            Character cur = pattern.charAt(i);
            if (map.containsKey(s)){
                if (map.get(s)!=cur) return false;
            }
            else if (set.contains(cur)) return false;
            else {
                map.put(s,cur);
                set.add(cur);
            }
        }
        return true;
    }
}