public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String cur = new String(chars);
            if (map.containsKey(cur)){
                List<String> list = map.get(cur);
                list.add(strs[i]);
                map.put(cur,list);
            }
            else {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(cur,list);
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for (String a : map.keySet()){
            res.add(map.get(a));
        }
        return res;
    }
}