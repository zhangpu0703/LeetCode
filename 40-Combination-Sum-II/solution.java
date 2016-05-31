public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        boolean[] visited = new boolean[candidates.length];
        helper(res,candidates,target,new ArrayList<Integer>(), 0, visited);
        return res;
    }
    public void helper(List<List<Integer>> res, int[] candidates, int target, List<Integer> path, int start, boolean[] visited){
        if (target==0){
            res.add(new ArrayList(path));
            return;
        }
        if (target<0) return;
        for (int i = start; i<candidates.length; i++){
            if (visited[i]) continue;
            if (i>0 && !visited[i-1] && candidates[i-1]==candidates[i]) continue;
            path.add(candidates[i]);
            visited[i]=true;
            helper(res,candidates,target-candidates[i], path, i+1 ,visited);
            path.remove(path.size()-1);
            visited[i]=false;
        }
    }
}