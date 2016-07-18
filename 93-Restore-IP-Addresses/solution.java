public class Solution {
    private List<String> res = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
        helper(s,"",4,0);
        return res;
    }
    public void helper(String s, String path, int remain, int ind){
        if (remain==0 && ind == s.length()){
            res.add(new String(path.substring(0,path.length()-1)));
            return;
        }
        else if (remain == 0 || ind == s.length()) return;
        String one = s.substring(ind,ind+1);
        helper(s,path+one+".",remain-1, ind+1);
        if (ind+2<=s.length() && s.charAt(ind)!='0'){
            String two = s.substring(ind,ind+2);
            helper(s,path+two+".",remain-1, ind+2);
        }
        if (ind+3<=s.length() && s.charAt(ind)!='0'){
            String three = s.substring(ind,ind+3);
            if (Integer.parseInt(three)<=255) helper(s,path+three+".",remain-1, ind+3);
        }
    }
}