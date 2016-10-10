public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i=0; i<s.length(); i++){
            char ss = s.charAt(i), tt = t.charAt(i);
            if (smap.containsKey(ss) && smap.get(ss)!=tt) return false;
            if (tmap.containsKey(tt) && tmap.get(tt)!=ss) return false;
            if (tmap.containsKey(tt) && !smap.containsKey(ss)) return false;
            if (!tmap.containsKey(tt) && smap.containsKey(ss)) return false;
            tmap.put(tt,ss);
            smap.put(ss,tt);
        }
        return true;
        
    }
}