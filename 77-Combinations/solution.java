public class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        helper(n,k,1,new ArrayList<Integer>());
        return res;
    }
    public void helper(int n, int k, int start, List<Integer> path){
        if (k==0){
            res.add(new ArrayList(path));
            return;
        }
        for (int i=start; i<=n; i++){
            path.add(i);
            helper(n,k-1,i+1,path);
            path.remove(path.size()-1);
        }
    }
}