public class Solution {
    public void nextPermutation(int[] nums) {
        int target= nums.length-1;
        while (target>0 && nums[target-1]>=nums[target]) target--;
        if (target>0){
            int halfLen = (nums.length-target)/2;
            for (int i=0; i<halfLen; i++){
                int temp = nums[target+i];
                nums[target+i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
            for (int j=target; j<nums.length; j++){
                if (nums[j]>nums[target-1]){
                    int cur = nums[j];
                    nums[j]=nums[target-1];
                    nums[target-1]=cur;
                    break;
                }
            }

        }
        else{
            for (int i=0; i<nums.length/2; i++){
                int temp=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
        }
    }
}