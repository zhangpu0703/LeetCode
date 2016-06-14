public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end<nums.length){
            sum+=nums[end];
            while (start<=end && sum>=s){
                res = Math.min(res,end-start+1);
                sum-=nums[start];
                start++;
            }
            
            end++;
        }
        if (res == Integer.MAX_VALUE) return 0;
        else return res;
    }
}