public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length]; 
        helper(nums, new ArrayList<Integer>(), used);
        return res;
    }
    public void helper(int[] nums, List<Integer> path, boolean[] used){
        if (path.size()==nums.length){
            res.add(new ArrayList(path));
            return;
        }
        for (int i=0; i<nums.length; i++){
            if (used[i]) continue;
            path.add(nums[i]);
            used[i]=true;
            helper(nums,path,used);
            used[i]=false;
            path.remove(path.size()-1);
        }
    }
}