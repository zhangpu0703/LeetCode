public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        List<Integer> res = new ArrayList<Integer>();
        if (n==0) return res;
        int len = words[0].length();
        HashMap<String, Integer> omap = new HashMap<String, Integer>();
        for (String ss : words){
            if (omap.containsKey(ss)) omap.put(ss,omap.get(ss)+1);
            else omap.put(ss,1);
        }
        for (int i=0; i<=s.length()-n*len; i++){
            //if ((i+n*len)>s.length()) break;
            if (helper(s,omap,i,len,n)) res.add(i);
        }
        return res;
    }
    public boolean helper(String s, HashMap<String, Integer> omap, int i, int len, int n){
        HashMap<String, Integer> map = new HashMap<String, Integer>(omap);
        for (int j=0; j<n; j++){
            if (map.isEmpty()) return true;
            String cur = s.substring(i+j*len, i+(j+1)*len);
            if (!map.containsKey(cur)) return false;
            else {
                if (map.get(cur) == 1) map.remove(cur);
                else map.put(cur,map.get(cur)-1);
                
            }
            
        }
        return true;
    }
}