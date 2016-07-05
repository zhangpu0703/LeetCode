public class Solution {
    List<String> res = new ArrayList<String>();
    public List<String> wordBreak(String s, Set<String> wordDict) {
        helper(s,wordDict,"", 0);
        return res;
    }
    public void helper(String s, Set<String> wordDict, String path, int start){
        int n = s.length();
        if (start == n) {
            res.add(path.trim());
            return;
        }
        
        for (String word : wordDict){
            int l = word.length();
            if (start+l <= n && s.substring(start,start+l).equals(word)){
                String cur = path+" "+word;
                helper(s,wordDict,cur,start+l);
            }
        }
    }
}