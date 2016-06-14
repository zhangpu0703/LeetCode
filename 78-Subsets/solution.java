public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //Arrays.sort(nums);
        helper(res, new ArrayList<Integer>(), 0, nums);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> path, int start, int[] nums){
        res.add(new ArrayList<Integer>(path));
        for (int i = start; i<nums.length; i++){
            path.add(nums[i]);
            helper(res, path, i+1, nums);
            path.remove(path.size()-1);
        }
    }
}