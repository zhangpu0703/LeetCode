public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums,0,new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums, int ind, List<Integer> path){
        res.add(new ArrayList<Integer>(path));
        if (ind == nums.length) return;
        for (int i=ind; i<nums.length; i++){
            path.add(nums[i]);
            helper(nums,i+1, path);
            path.remove(path.size()-1);
        }
    }
}