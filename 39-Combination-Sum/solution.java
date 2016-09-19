public class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,target,0, new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] candidates, int target, int ind, List<Integer> path){
        if (target == 0){
            res.add(new ArrayList(path));
            return;
        }
        if (ind == candidates.length || target<0) return;
        for (int i = ind; i<candidates.length; i++){
            path.add(candidates[i]);
            helper(candidates,target-candidates[i], i, path);
            path.remove(path.size()-1);
        }
    }
}