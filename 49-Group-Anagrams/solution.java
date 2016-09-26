public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i=0; i<strs.length; i++){
            char[] cur = strs[i].toCharArray();
            Arrays.sort(cur);
            String key = String.valueOf(cur);
            if (map.containsKey(key)){
                List<String> temp = map.get(key);
                temp.add(strs[i]);
                map.put(key,temp);
            }
            else{
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                map.put(key,temp);
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for (String s : map.keySet()){
            res.add(map.get(s));
        }
        return res;
    }
}