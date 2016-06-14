public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] res = new int[nums.length];
        if (nums.length == 0) return false;
        res[0]=1;
        for (int i=1; i<nums.length; i++){
            res[i]=1;
            for (int j=0; j<i; j++){
                if (nums[j]<nums[i]) res[i]=Math.max(res[i],res[j]+1);
            }
        }
        for (int i=0; i<res.length; i++){
            if (res[i]>=3) return true;
        }
        return false;
    }
}