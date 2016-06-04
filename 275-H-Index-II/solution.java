public class Solution {
    public int hIndex(int[] citations) {
        int start=0;
        int end=citations.length-1;
        if (citations.length==0) return 0;
        if (end == 0) return citations[0]==0? 0: 1;
        int mid;
        while (start<=end){
            mid = start+(end-start)/2;
            if (citations[mid]>=citations.length-mid) end=mid-1;
            else start = mid+1;
        }
        return citations.length-end-1;
    }
}