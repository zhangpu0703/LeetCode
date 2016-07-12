public class Solution {
    private List<List<String>> res = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        helper(s,0, new ArrayList<String>());
        return res;
    }
    
    public void helper(String s, int curInd, List<String> path){
        if (curInd == s.length()){
            res.add(new ArrayList(path));
            return;
        }
        for (int i=curInd+1; i<=s.length(); i++){
            if (isPal(s.substring(curInd,i))){
                path.add(s.substring(curInd,i));
                helper(s,i,path);
                path.remove(path.size()-1);
            }
        }
    }
    
    public boolean isPal(String s){
        int start = 0, end = s.length()-1;
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}