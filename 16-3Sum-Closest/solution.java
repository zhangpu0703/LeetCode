public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i<nums.length-2; i++){
            int cur = nums[i];
            int left = i+1, right = nums.length-1;
            while (left<right){
                int sum = cur+nums[left]+nums[right];
                if (Math.abs(sum-target)<diff) {
                    res = sum;
                    diff = Math.abs(sum-target);
                }
                if (sum>target) right--;
                else left++;
            }
        }
        return res;
    }
}