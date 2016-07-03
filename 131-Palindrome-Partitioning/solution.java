public class Solution {
    List<List<String>> res = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        helper(s,0, new ArrayList<String>());
        return res;
    }
    public void helper(String s, int start, List<String> path){
        if (start==s.length()) res.add(new ArrayList(path));
        for (int i= start; i<s.length(); i++){
            if (isPalin(s,start,i)){
                path.add(s.substring(start,i+1));
                helper(s,i+1,path);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalin(String s, int start, int end){
        while (start<end){
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}