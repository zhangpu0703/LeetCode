public class Solution {
    public int missingNumber(int[] nums) {
        boolean[] set = new boolean[nums.length+1];
        for (int num : nums){
            set[num]=true;
        }
        for (int i=0; i<=nums.length; i++){
            if (!set[i]) return i;
        }
        return nums.length;
    }
}