public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int res = 0;
        Set<Integer> exist = new HashSet<Integer>();
        Queue<Integer> heap = new PriorityQueue<Integer>();
        for (int prime : primes){
            exist.add(prime);
            heap.offer(prime);
        }
        for (int i=0; i<n; i++){
            res = heap.poll();
            for (int prime : primes){
                int cur = prime*res;
                if (!exist.contains(cur)){
                    heap.offer(cur);
                    exist.add(cur);
                }

            }
        }
        return res;
    }
}