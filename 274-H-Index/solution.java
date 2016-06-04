public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if (n==0) return 0;
        int[] res = new int[n+1];
        for (int cite : citations){
            if (cite>=n) res[n]++;
            else res[cite]++;
        }
        int hInd = n;
        int sum = 0;
        while (hInd>=0){
            if (sum==hInd) return hInd;
            sum+=res[hInd];
        }
        return hInd;
    }
}