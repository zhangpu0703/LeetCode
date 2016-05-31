public class Solution {
    public void moveZeroes(int[] nums) {
        int curind = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                nums[curind]=nums[i];
                curind++;
            }
        }
        for (int i=curind; i<nums.length; i++){
            nums[i]=0;
        }
    }
}