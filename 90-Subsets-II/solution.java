public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(res,new ArrayList<Integer>(), 0, nums, used);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> path, int start, int[] nums, boolean[] used){
        res.add(new ArrayList<Integer>(path));
        for (int i=start; i<nums.length; i++){
            if (i>0 && !used[i-1] && nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            used[i]=true;
            helper(res, path, i+1, nums, used);
            used[i]=false;
            path.remove(path.size()-1);
        }
    }
}