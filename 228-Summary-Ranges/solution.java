public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums.length==0) return res;
        int i=0;
        while (i<nums.length){
            int cur = i;
            while (i+1<nums.length && nums[i+1]==nums[i]+1) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            if (cur == i) sb.append(nums[i]);
            else {
                sb.append(nums[cur]);
                sb.append("->");
                sb.append(nums[i]);
            }
            res.add(sb.toString());
            i++;
            //i=cur;
        }
        return res;
    }
}