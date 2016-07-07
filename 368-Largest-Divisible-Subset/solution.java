public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int[] prev = new int[nums.length];
        Arrays.fill(prev,-1);
        //for each element in nums, find the length of largest subset it has.
        for (int i = 1; i < nums.length; i++){
            for (int j = i-1; j >= 0; j--){
                if (nums[i] % nums[j] == 0){
                    if (dp[i] < dp[j] + 1){
                        dp[i] = dp[j] + 1;
                        prev[i]=j;
                    }
                }
            }
        }
        
        //pick the index of the largest element in dp.
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++){
            maxIndex = dp[i] > dp[maxIndex] ?  i :  maxIndex;
        }
        
        //from nums[maxIndex] to 0, add every element belongs to the largest subset.
        int temp = nums[maxIndex];
        while (maxIndex != -1){
            res.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        return res;
    }
}