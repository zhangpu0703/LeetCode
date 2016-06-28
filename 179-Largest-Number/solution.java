public class Solution {
    public String largestNumber(int[] nums) {
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String s1 = a+b;
                String s2 = b+a;
                return s2.compareTo(s1);
            }
        };
        PriorityQueue<String> queue = new PriorityQueue<>(comp);
        for (int num : nums){
            queue.offer(String.valueOf(num));
        }
        String res = "";
        while (!queue.isEmpty()){
            res = res+queue.poll();
        }
        if (res.charAt(0)=='0') return "0";
        return res;
    }
}