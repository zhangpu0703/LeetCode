public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<=s.length()-10; i++){
            String cur = s.substring(i,i+10);
            if (map.containsKey(cur)) map.put(cur,map.get(cur)+1);
            else map.put(cur,1);
        }
        List<String> res = new ArrayList<>();
        for (String ss : map.keySet()){
            if (map.get(ss)>1) res.add(ss);
        }
        return res;
    }
}