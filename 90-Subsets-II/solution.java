public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        helper(nums,0,new ArrayList<Integer>(), visited);
        return res;
    }
    public void helper(int[] nums, int ind, List<Integer> path, boolean[] visited){
        res.add(new ArrayList<Integer>(path));
        if (ind == nums.length) return;
        for (int i = ind; i<nums.length; i++){
            if (i>0 && !visited[i-1] && nums[i-1] == nums[i]) continue;
            visited[i]=true;
            path.add(nums[i]);
            helper(nums, i+1, path, visited);
            visited[i]=false;
            path.remove(path.size()-1);
        }
    }
}