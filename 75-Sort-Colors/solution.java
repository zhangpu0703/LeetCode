public class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length-1;
        for (int i=0; i<=right; i++){
            while (i < right && nums[i]==2){
                swap(nums,i,right);
                right--;
            }
            while (i>left && nums[i]==0){
                swap(nums,i,left);
                left++;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}