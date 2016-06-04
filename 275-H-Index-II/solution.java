public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length==0) return 0;
        int start = 0;
        int end = citations.length;
        while (start<end){
            int mid = start+(end-start)/2;
            if (citations[mid]<=mid+1) start = mid;
            else end = mid-1;
        }
        return start;
    }
}