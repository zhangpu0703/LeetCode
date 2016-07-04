public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        int[] res = new int[n];
        res[0]=1;
        for (int i=1; i<n; i++){
            res[i]=1;
            for (int j=0; j<i; j++){
                if (nums[j]<nums[i]) res[i]=Math.max(res[i],res[j]+1);
            }
        }
        int max = 1;
        for (int r : res) max = Math.max(r,max);
        return max;
    }
}