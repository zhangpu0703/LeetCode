public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    private boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used=new boolean[nums.length];
        helper(nums, new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums, List<Integer> path){
        if (path.size()==nums.length){
            res.add(new ArrayList(path));
            return;
        }
        for (int i=0; i<nums.length; i++){
            if (used[i]) continue;
            if (i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            path.add(nums[i]);
            used[i]=true;
            helper(nums, path);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}