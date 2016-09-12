public class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length-k;
        int start = 0, end = nums.length-1;
        while (start<end){
            int pivot = quickselect(nums,start,end);
            if (pivot==k) return nums[pivot];
            else if (pivot<k) start = pivot+1;
            else end = pivot;
        }
        return nums[start];
    }
    public int quickselect(int[] nums, int start, int end){
        if (start>=end) return start;
        int pivot = end;
        int i = start, j = end;
        while(i<j){
            while(i<j && nums[i]<=nums[pivot]) i++;
            while (i<j && nums[j]>=nums[pivot]) j--;
            if (i<j) swap(nums,i,j);
        }
        swap(nums,j,pivot);
        return i;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}