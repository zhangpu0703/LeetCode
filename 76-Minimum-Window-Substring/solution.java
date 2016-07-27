public class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<t.length(); i++) {
            if (map.containsKey(t.charAt(i))) map.put(t.charAt(i),map.get(t.charAt(i))+1);
            else map.put(t.charAt(i),1);
        }
        int start = 0;
        int len = Integer.MAX_VALUE;
        int count = 0;
        String res = "";
        for (int end=0; end<s.length(); end++){
            if (!map.containsKey(s.charAt(end))){
                continue;
            }
            map.put(s.charAt(end),map.get(s.charAt(end))-1);
            if (map.get(s.charAt(end))>=0) {
                count++;
                
            }
            while (count == t.length()){
                if (end-start+1<len){
                    res = s.substring(start,end+1);
                    len = end-start+1;
                }
                if (map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    if (map.get(s.charAt(start))>0) count--;
                }
                start++;
            }
        }
        return res;
    }
}