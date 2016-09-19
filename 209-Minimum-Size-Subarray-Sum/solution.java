public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        while (right<nums.length){
            while (right<nums.length && sum<s){
                sum+=nums[right];
                right++;
            }
            while(left<=right && sum>=s){
                sum-=nums[left];
                len = Math.min(len,right-left);
                left++;
            }
        }
        if (len==Integer.MAX_VALUE) return 0;
        return len;
    }
}