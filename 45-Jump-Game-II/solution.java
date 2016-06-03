public class Solution {
    public int jump(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=0;
        for (int i=1; i<nums.length; i++){
            res[i]=Integer.MAX_VALUE;
            for (int j = 0; j<i; j++){
                if (j+nums[j]>=i){
                    res[i]=Math.min(res[i],res[j]+1);
                }
            }
        }
        return res[nums.length-1];
    }
}