public class Solution {
    public int missingNumber(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int num:nums) sum+=num;
        return (int) (n*(n+1)/2-sum);
    }
}