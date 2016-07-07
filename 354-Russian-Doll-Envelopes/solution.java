public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Comparator<int[]> envComp = new Comparator<int[]>(){
          @Override
          public int compare(int[] A, int[] B){
              if (A[0]!=B[0]) return A[0]-B[0];
              else return A[1]-B[1];
          }
        };
        int m =envelopes.length;
        if (m==0) return 0;
        Arrays.sort(envelopes, envComp);
        int[] res = new int[m];
        Arrays.fill(res,1);
        
        for (int i=1; i<m; i++){
            for (int j=0; j<i; j++){
                if (envelopes[i][0]>envelopes[j][0] && envelopes[i][1]>envelopes[j][1]) res[i]=Math.max(res[i],res[j]+1);
            }
        }
        
        int max = 0;
        for (int r : res) max = Math.max(max,r);
        return max;
    }
}