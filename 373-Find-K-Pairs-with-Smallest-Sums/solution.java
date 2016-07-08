public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Comparator<int[]> pairComp = new Comparator<int[]>(){
            @Override
            public int compare (int[] A, int[] B){
                return A[0]-B[0]+A[1]-B[1];
            }
        };
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(pairComp);
        for (int i=0; i<nums1.length; i++){
            for (int j=0; j<nums2.length; j++){
                int[] cur = {nums1[i],nums2[j]};
                queue.offer(cur);
            }
        }
        List<int[]> res = new ArrayList<int[]>();
        if (k>nums1.length*nums2.length) k = nums1.length*nums2.length;
        for (int i=0; i<k ; i++){
            res.add(queue.poll());
        }
        return res;
    }
}