public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] res = new int[nums.length];
        
        for (int i=0; i<nums.length; i++){
            res[i]=1;
            for (int j=0; j<i; j++){
                if (nums[j]<nums[i]) res[i] = Math.max(res[i], res[j]+1);
            }
        }
        int min = 0;
        for (int i = 0; i<nums.length; i++) {
            min = Math.max(min,res[i]);
        }
        return min;
    }
}