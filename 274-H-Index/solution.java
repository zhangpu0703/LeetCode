public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n+1];
        for (int i=0; i<n; i++){
            int cur = citations[i];
            if (cur>n) counts[n]++;
            else counts[cur]++;
        }
        int sum = 0;
        for (int h=n; h>=0; h--){
            sum+=counts[h];
            if (sum>=h) return h;
        }
        return 0;
    }
}