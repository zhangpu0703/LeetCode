public class Solution {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        helper(s,4,0,"");
        return res;
    }
    public void helper(String s, int n, int start, String path){
        if (n==0 && start == s.length()){
            res.add(path.substring(0,path.length()-1));
            return;
        }
        if (n==0 || start == s.length()) return;
        String one, two, three;
        one = s.substring(start,start+1);
        helper(s,n-1,start+1,path+one+".");
        if (start+2<=s.length() && s.charAt(start)!='0') {
            two = s.substring(start,start+2);
            helper(s,n-1,start+2,path+two+".");
        }
        if (start+3<=s.length() && s.charAt(start)!='0') {
            three = s.substring(start,start+3);
            if (Integer.parseInt(three)<=255) helper(s,n-1,start+3,path+three+".");
        }
    }
}