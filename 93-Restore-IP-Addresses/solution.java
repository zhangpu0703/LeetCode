public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        helper(s, res, "", 4, 0);
        return res;
    }
    public void helper(String s, List<String> res, String path, int n, int ind){
        if (n==0 && ind == s.length()) {
            res.add(path.substring(0,path.length()-1));
            return;
        }
        if (ind == s.length()) return;
        if (s.length()-ind>3*n || s.length()-ind<n) return; 
        String first="",second="",third="";
        first = s.substring(ind,ind+1);
        if (ind<s.length()-1) second = s.substring(ind,ind+2);
        if (ind<s.length()-2) third = s.substring(ind,ind+3);
        path=path+first+'.';
        helper(s, res,path, n-1, ind+1);
        path=path.substring(0,path.length()-2);
        
        if (!second.equals("") && second.charAt(0)!='0') {
            path=path+second+'.';
            helper(s, res,path, n-1, ind+2);
            path=path.substring(0,path.length()-3);
        }
        
        if (!third.equals("") && third.charAt(0)!='0') {
            if (Integer.parseInt(third)<=255){
                path=path+third+'.';
                helper(s, res,path, n-1, ind+3);
                path=path.substring(0,path.length()-4);
            }
        }
    }
}