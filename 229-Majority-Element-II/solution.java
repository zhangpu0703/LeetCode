public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int major1=0, major2=1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==major1) count1++;
            else if (nums[i]==major2) count2++;
            else if (count1==0) {
                major1 = nums[i];
                count1 = 1;
            }
            else if (count2==0) {
                major2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        count1=0;
        count2=0;
        for (int num : nums){
            if (num == major1) count1++;
            if (num==major2) count2++;
        }
        if (count1>nums.length/3) res.add(major1);
        if (count2>nums.length/3) res.add(major2);
        return res;
    }
}