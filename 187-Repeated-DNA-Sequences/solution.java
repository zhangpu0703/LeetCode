public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();
        for (int i=0; i<=s.length()-10; i++){
            String cur = s.substring(i,i+10);
            if (set.contains(cur) && !res.contains(cur)) res.add(cur);
            else set.add(cur);
        }
        return res;
    }
}