public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1){
            set.add(num);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums2){
            if (set.contains(num) && !list.contains(num)) list.add(num);
        }
        int[] res = new int[list.size()];
        for (int i=0; i<res.length; i++){
            res[i]=list.get(i);
        }
        return res;
    }
}