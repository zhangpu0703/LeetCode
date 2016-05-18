public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length<4) return res;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-3; i++){
            int cur = target-nums[i];
            for (int j=i+1; j<nums.length-2; j++){
                int temp = nums[j];
                int left = j+1;
                int right = nums.length-1;
                while (left<right){
                    if (nums[j]+nums[left]+nums[right]==cur){
                        List<Integer> sol = new ArrayList<Integer>();
                        sol.add(nums[i]);
                        sol.add(nums[j]);
                        sol.add(nums[left]);
                        sol.add(nums[right]);
                        res.add(sol);
                        while (left<right && nums[left+1]==nums[left]) left++;
                        while (left<right && nums[right-1]==nums[right]) right--;
                    }
                    else if (nums[j]+nums[left]+nums[right]<cur) left++;
                    else right--;
                }
            }
        }
        return res;
    }
}