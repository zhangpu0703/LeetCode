public class Solution {
    private Comparator<int[]> arrComp = new Comparator<int[]>(){
        public int compare (int[] a, int[] b){
            if (a[0] == b[0]) return b[1]-a[1];
            else return a[0]-b[0];
        }
    };
    public int[][] reconstructQueue(int[][] people) {
        int m = people.length;
        int[][] res = new int[m][2];
        Arrays.sort(people,arrComp);
        Arrays.fill(res,new int[]{-1,-1});
        for (int i=0; i<m; i++){
            int pre = people[i][1];
            int ind = 0, j = 0;
            while (ind<pre){
                if (res[j][0] == -1) ind++;
                j++;
            }
            while(res[j][0]!=-1) j++;
            res[j]=people[i];
        }
        return res;
    }
}