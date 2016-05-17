public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int diff = 0;
        int res = 0;
        for (int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                diff=nums[i]+nums[left]+nums[right]-target;
                if (diff==0) return target;
                if (Math.abs(diff)<min){
                    res=nums[i]+nums[left]+nums[right];
                    min = Math.abs(diff);
                }
                if (diff<0) left++;
                if (diff>0) right--;
            }
        }
        return res;
    }
}