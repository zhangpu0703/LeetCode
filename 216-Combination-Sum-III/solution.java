public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,new ArrayList<Integer>(), k, n, 1);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> path, int k, int n, int start){
        if (path.size()==k){
            if (n==0) res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i=start; i<=9; i++){
            path.add(i);
            helper(res,path,k,n-i,i+1);
            path.remove(path.size()-1);
        }
    }
}