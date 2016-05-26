public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        List<Integer> res = new ArrayList<Integer>();
        if (n==0) return res;
        int len = words[0].length();
        for (int i=0; i<s.length(); i++){
            if ((i+n*len)>s.length()) break;
            if (helper(s,words,i,len,n)) res.add(i);
        }
        return res;
    }
    public boolean helper(String s, String[] words, int i, int len, int n){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String ss : words){
            if (map.containsKey(ss)) map.put(ss,map.get(ss)+1);
            else map.put(ss,1);
        }
        for (int j=0; j<n; j++){
            String cur = s.substring(i+j*len, i+(j+1)*len);
            if (!map.containsKey(cur) || map.get(cur)==0) return false;
            else map.put(cur,map.get(cur)-1);
        }
        return true;
    }
}