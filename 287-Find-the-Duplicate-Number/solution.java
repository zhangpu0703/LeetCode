public class Solution {
    public int findDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            int count = 0;
            for (int num : nums){
                if (num<=mid) count++;
            }
            if (count>mid) end = mid;
            else start = mid+1;
        }
        return start;
    }
}