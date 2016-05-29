public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        while (start<end-1){
            int mid = start+(end-start)/2;
            if (target>nums[mid]) start = mid;
            else if (target<nums[mid]) end = mid;
            else if (mid>0 && nums[mid]==nums[mid-1]) end = mid;
            else{
                res[0]=mid;
                break;
            }
        }
        if (nums[start]==target) res[0]=start;
        else if (start<nums.length-1 && nums[start+1]==target) res[0]=start+1;
        start = 0;
        end = nums.length-1;
        while (start<end-1){
            int mid = start+(end-start)/2;
            if (target>nums[mid]) start = mid;
            else if (target<nums[mid]) end = mid;
            else if (mid<nums.length-1 && nums[mid]==nums[mid+1]) start = mid;
            else{
                res[1]=mid;
                break;
            }
        }
        if (nums[end]==target) res[1]=end;
        else if (end>0 && nums[end-1]==target) res[1]=end-1;
        return res;
    }
}