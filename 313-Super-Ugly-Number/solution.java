public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        /*
        int res = 0;
        Set<Integer> exist = new HashSet<Integer>();
        Queue<Integer> heap = new PriorityQueue<Integer>();
        heap.offer(1);
        exist.add(1);
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
        */
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        ugly[0]=1;
        for (int i = 1; i<n; i++){
            int cur = Integer.MAX_VALUE;
            for (int j = 0; j<primes.length; j++){
                cur = Math.min(cur,primes[j]*ugly[index[j]]);
            }
            ugly[i]=cur;
            
            for (int j=0; j<index.length; j++){
                if (cur==primes[j]*ugly[index[j]]) index[j]++;
            }
        }
        return ugly[n-1];
    }
}