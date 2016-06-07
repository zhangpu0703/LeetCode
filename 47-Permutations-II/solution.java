public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length==0) return res;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(res,new ArrayList<Integer>(), nums, used);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> path, int[] nums, boolean[] used){
        if (path.size()==nums.length){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i<nums.length; i++){
            if (i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            if (!used[i]){
                path.add(nums[i]);
                used[i]=true;
                helper(res,path,nums,used);
                path.remove(path.size()-1);
                used[i]=false;
            } 
        }
    }
}