public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> repeated = new HashSet<String>();
        Set<String> exist = new HashSet<String>();
        for (int i=0;i<=s.length()-10; i++){
            String cur = s.substring(i,i+10);
            if (exist.contains(cur)) repeated.add(cur);
            else exist.add(cur);
        }
        List<String> res = new ArrayList<String>();
        for (String ss : repeated) res.add(ss);
        return res;
    }
}