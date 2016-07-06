public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs){
            char[] cur = str.toCharArray();
            Arrays.sort(cur);
            String s = String.valueOf(cur);
            if (map.containsKey(s)){
                List<String> list = map.get(s);
                list.add(str);
                map.put(s,list);
            }
            else{
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(s,list);
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for (String t : map.keySet()){
            res.add(map.get(t));
        }
        return res;
    }
}