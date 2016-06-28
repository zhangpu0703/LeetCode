public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        for (int i=m-2; i>=0; i--){
            int n = triangle.get(i).size();
            for (int j=0; j<n; j++){
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}