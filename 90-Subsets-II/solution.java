public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        helper(new ArrayList<Integer>(), 0, nums, visited);
        return res;
    }
    public void helper(List<Integer> path, int start, int[] nums, boolean[] visited){
        res.add(new ArrayList<Integer>(path));
        for (int i=start; i<nums.length; i++){
            if (i>0 && !visited[i-1] && nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            visited[i]=true;
            helper(path, i+1, nums, visited);
            visited[i]=false;
            path.remove(path.size()-1);
        }
    }
}