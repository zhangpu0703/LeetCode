public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,candidates, target, new ArrayList<Integer>(),0);
        return res;
    }
    public void helper(List<List<Integer>> res, int[] candidates, int target, List<Integer> path, int start){
        if (target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        if (target<0) return;
        for (int i=start; i<candidates.length; i++){
            while (i<candidates.length-1 && candidates[i]==candidates[i+1]) i++;
            path.add(candidates[i]);
            helper(res,candidates, target-candidates[i], path, i);
            path.remove(path.size()-1);
        }
        return;
    }
}