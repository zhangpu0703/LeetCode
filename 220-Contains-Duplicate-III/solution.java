public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i=0; i<nums.length; i++){
            int ind = 1;
            while (ind <= k && i+ind<nums.length){
                int abs = nums[i+ind]-nums[i];
                if (abs<=t && abs>=-t) return true;
            }
        }
        return false;
    }
}