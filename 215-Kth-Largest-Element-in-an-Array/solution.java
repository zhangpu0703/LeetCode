public class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length-k;
        int start = 0, end = nums.length-1;
        while (start<end){
            int ind = partition(nums,start,end);
            if (ind == k) return nums[ind];
            else if (ind<k) start = ind+1;
            else end = ind-1;
        }
        return nums[start];
    }
    public int partition(int[] nums, int start, int end){
        int pivot = end;
        int i = start, j = end;
        while (i<j){
            while (i<j && nums[i]<=nums[pivot]) i++;
            while (i<j && nums[j]>=nums[pivot]) j--;
            if (i<j) swap(nums,i,j);
        }
        swap(nums,j,pivot);
        return j;
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}