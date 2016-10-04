public class Solution {
    public void wiggleSort(int[] nums) {
        int[] res = Arrays.copyOf(nums,nums.length);
        Arrays.sort(res);
        int mid = res.length/2;
        if (res.length%2==0) mid--;
        int ind = 0;
        for (int i=0; i<=mid; i++){
            nums[ind]=res[mid-i];
            if (ind+1<nums.length)  nums[ind+1] = res[res.length-1-i];
            ind+=2;
        }
    }
}