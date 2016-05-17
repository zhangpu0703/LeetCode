public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            if (i!=0 && nums[i-1]==nums[i]) continue;
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                int cur = nums[i]+nums[left]+nums[right];
                if (cur==0){
                    List<Integer> sol = new ArrayList<Integer>();
                    sol.add(nums[i]);
                    sol.add(nums[left]);
                    sol.add(nums[right]);
                    res.add(sol);
                    while(left<right&&nums[left+1]==nums[left]) left++;
                    while(left<right&&nums[right-1]==nums[right]) right--;
                    left++;
                    right--;
                }
                else if (cur<0) left++;
                else right--;
            }
        }
        return res;
    }
}