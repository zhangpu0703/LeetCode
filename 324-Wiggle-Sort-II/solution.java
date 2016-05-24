public class Solution {
    public void wiggleSort(int[] nums) {
        int[] res = Arrays.copyOf(nums,nums.length);
        Arrays.sort(res);
        int mid;
        if (res.length%2==0) mid = res.length/2-1;
        else mid=res.length/2;
        int curInd = 0;
        for (int i=0; i<=mid; i++){
            nums[curInd] = res[mid-i];
            if (curInd+1<res.length) nums[curInd+1] = res[nums.length-i-1];
            curInd+=2;
        }
    }
}