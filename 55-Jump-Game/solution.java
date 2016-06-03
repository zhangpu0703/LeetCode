public class Solution {
    public boolean canJump(int[] nums) {
        //if (nums.length==1) return true;
        int farthest = 0;
        for(int i=0;i<nums.length;i++){
            if (i<=farthest) {
                farthest = Math.max(i+nums[i],farthest);
            }
            else return false;
        }
        return true;
    }   
}