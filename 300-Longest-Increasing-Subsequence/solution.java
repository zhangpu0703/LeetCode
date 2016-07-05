public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        for (int i=1; i<nums.length; i++){
            for (int j=0; j<i; j++){
                if (nums[j]<nums[i]) res[i]=Math.max(res[i],res[j]+1);
            }
        }
        int max = 0;
        for (int r : res) max = Math.max(r,max);
        return max;
    }
}