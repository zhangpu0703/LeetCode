public class Solution {
    private int[] original;
    private Random rand;
    public Solution(int[] nums) {
        this.original = Arrays.copyOf(nums,nums.length);
        this.rand = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] nums = Arrays.copyOf(original,original.length);
        for (int i = 0; i<nums.length; i++){
            int ind = rand.nextInt(i+1);
            swap(nums,i,ind);
        }
        return nums;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */