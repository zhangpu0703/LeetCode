public class Solution {
    private List<String> res = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
        recurse(s,"",4,0);
        return res;
    }
    public void recurse(String s, String cur, int k, int ind){
        if (k == 0 && ind == s.length()){
            res.add(cur.substring(0,cur.length()-1));
            return;
        }
        else if (k == 0 || ind == s.length()) return;
        int i = ind;
        int num = Integer.parseInt(s.substring(i,i+1));
        recurse(s,cur+num+'.',k-1,i+1);
        if (s.charAt(i)!='0' && i+2<=s.length()){
            num = Integer.parseInt(s.substring(i,i+2));
            recurse(s,cur+num+'.',k-1,i+2);
        }
        if (s.charAt(i)!='0' && i+3<=s.length()){
            num = Integer.parseInt(s.substring(i,i+3));
            if (num<256){
                recurse(s,cur+num+'.',k-1,i+3);
            }
        }
    }
}