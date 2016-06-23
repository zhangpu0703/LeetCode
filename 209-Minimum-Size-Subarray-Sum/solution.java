public class Solution {
     public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0; 
        int right = 0;
        int sum = 0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=s){
                sum-=nums[left];
                res = Math.min(res,right-left+1);
                left++;
            }
            right++;
        }
        if (res == Integer.MAX_VALUE) return 0;
        else return res;
    }
}