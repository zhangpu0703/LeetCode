public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        int start = 0;
        int end = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (end<n){
            sum+=nums[end];
            while(sum>=s){
                sum-=nums[start];
                res=Math.min(res,end-start+1);
                start++;
            }
            
            end++;
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}