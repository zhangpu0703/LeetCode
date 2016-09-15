public class Solution {
    private int[] arr;
    private Random rand;
    public Solution(int[] nums) {
        arr = nums;
        rand = new Random();
    }
    
    public int pick(int target) {
        int ind = -1;
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]!=target) continue;
            count++;
            int r = rand.nextInt(count);
            if (r==0){
                ind = i;
            }
        }
        return ind;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */