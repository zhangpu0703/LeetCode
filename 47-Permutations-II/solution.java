public class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    private boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used=new boolean[nums.length];
        helper(nums, new ArrayList<Integer>(), 0);
        return res;
    }
    public void helper(int[] nums, List<Integer> path, int start){
        if (path.size()==nums.length){
            res.add(new ArrayList(path));
            return;
        }
        for (int i=0; i<nums.length; i++){
            if (used[i]) continue;
            if (i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            path.add(nums[i]);
            used[i]=true;
            helper(nums, path,start+1);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}