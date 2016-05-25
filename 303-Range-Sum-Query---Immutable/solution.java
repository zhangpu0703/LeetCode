public class NumArray {
        private int[] cum;
    public NumArray(int[] nums) {
        cum= new int[nums.length];
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
            cum[i]=sum;
        }
    }

    public int sumRange(int i, int j) {
        if (cum.length==0) return 0;
        else if (i==0) return cum[j];
        else return cum[j]-cum[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);