public class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            if (i==0) sum[i]=nums[i];
            else sum[i]=sum[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i==0) return sum[j];
        else return sum[j]-sum[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);