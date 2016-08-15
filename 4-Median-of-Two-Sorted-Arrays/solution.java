public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (kthSamllest(nums1, 0, nums2, 0, l) + kthSamllest(nums1, 0, nums2, 0, r)) / 2.0;
    }
    public double kthSamllest(int[] A, int aStart, int[] B, int bStart, int k){
        if (aStart>=A.length) return B[bStart+k-1];
        if (bStart>=B.length) return A[aStart+k-1];
        if (k == 1) return Math.min(A[aStart], B[bStart]);
        int aMid = aStart+k/2-1 >= A.length? Integer.MAX_VALUE : A[aStart+k/2-1]; 
        int bMid = bStart+k/2-1 >= B.length? Integer.MAX_VALUE : B[bStart+k/2-1];
        if (aMid>bMid) return kthSamllest(A,aStart,B,bStart+k/2,k-k/2);
        else return kthSamllest(A,aStart+k/2,B,bStart,k-k/2);
    }
    
}