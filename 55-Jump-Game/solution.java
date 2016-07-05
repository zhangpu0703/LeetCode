public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        int farthest = nums[0];
        for (int i=1; i<=farthest; i++){
            if (farthest>=nums.length-1) return true;
            farthest=Math.max(farthest,i+nums[i]);
        }
        return false;
    }
}