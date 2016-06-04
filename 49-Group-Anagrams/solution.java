public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (map.containsKey(key)){
                List<String> cur = map.get(key);
                cur.add(str);
                map.put(key,cur);
            }
            else {
                List<String> cur = new ArrayList<String>();
                cur.add(str);
                map.put(key,cur);
            }
        }
        for (List<String> path : map.values()){
            res.add(path);
        }
        return res;
        
    }
    
}