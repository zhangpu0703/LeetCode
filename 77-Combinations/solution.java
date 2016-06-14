public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        boolean[] used = new boolean[n];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res, new ArrayList<Integer>(), n, k, used, 1);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> path, int n, int k, boolean[] used, int start){
        if (k==0){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i<=n; i++){
            if (used[i-1]) continue;
            else{
                path.add(i);
                used[i-1]=true;
                helper(res,path,n,k-1,used,i);
                used[i-1]=false;
                path.remove(path.size()-1);
            }
        }
    }
}