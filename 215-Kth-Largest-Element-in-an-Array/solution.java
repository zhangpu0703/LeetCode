public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        k = nums.length - k;
        while (start<end){
            int pivot = quickselect(nums,start,end);
            if (pivot == k) return nums[pivot];
            else if (pivot < k) start=pivot+1;
            else end = pivot-1;
            
        }
        return nums[start];
    }
    public int quickselect(int[] nums, int start, int end){
        int pivot = end;
        //int smaller = start;
        int i = start; 
        int j = end;
        while (i<j){
            while (i<j && nums[i]<=nums[pivot]) i++;
            while (i<j && nums[j]>=nums[pivot]) j--;
            if (i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int cur = nums[pivot];
        nums[pivot]=nums[j];
        nums[j]=cur;
        return j;
    }
}