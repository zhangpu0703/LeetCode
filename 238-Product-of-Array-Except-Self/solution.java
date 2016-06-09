public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length+1];
        int[] right = new int[nums.length+1];
        left[0]=1;
        right[nums.length]=1;
        for (int i = 1; i<=nums.length; i++){
            left[i]=nums[i-1]*left[i-1];
        }
        for (int i=nums.length-1; i>=0; i--){
            right[i]=right[i+1]*nums[i];
        }
        
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            res[i]=left[i]*right[i+1];
        }
        return res;
    }
}