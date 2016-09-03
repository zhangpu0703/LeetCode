public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        int[] res = new int[2];
        while (start<end){
            int cur = numbers[start]+numbers[end];
            if (cur == target) {
                res[0]=start+1;
                res[1]=end+1;
                break;
            }
            else if (cur > target) end--;
            else start++;
        }
        return res;
    }
}