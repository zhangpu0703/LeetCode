public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=1) return nums.length;
        int len=1;
        int pre = nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]!=pre) {
                len++;
                nums[len-1]=nums[i];
                pre = nums[i];
            }
        }
        return len;
    }
}