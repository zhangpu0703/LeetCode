public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);
        int f1 = nums[0];
        int f2 = nums[1];
        int temp;
        for (int i = 2; i<nums.length-1; i++){
            temp = f2;
            f2 = Math.max(f2,f1+nums[i]);
            f1 = Math.max(f1,temp);
        }
        int first = Math.max(f1,f2);
        
        f1 = nums[1];
        f2 = nums[2];
        for (int i=3; i<nums.length; i++){
            temp = f2;
            f2 = Math.max(f2,f1+nums[i]);
            f1=Math.max(f1,temp);
        }
        int second = Math.max(f1,f2);
        return Math.max(first,second);
    }
}