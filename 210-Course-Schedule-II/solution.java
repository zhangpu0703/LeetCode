public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int ind = 0;
        int m = prerequisites.length;
        int[] counts = new int[numCourses];
        for (int i=0; i<m; i++){
            counts[prerequisites[i][0]]++;
        }
        
        Queue<Integer> finished = new LinkedList<Integer>();
        
        for (int i=0; i<numCourses; i++){
            if (counts[i]==0){
                finished.offer(i);
                res[ind]=i;
                ind++;
            }
        }
        
        while (!finished.isEmpty()){
            int cur = finished.poll();
            for (int i=0; i<m; i++){
                if (prerequisites[i][1]==cur){
                    counts[prerequisites[i][0]]--;
                    if (counts[prerequisites[i][0]]==0){
                        finished.offer(prerequisites[i][0]);
                        res[ind]=prerequisites[i][0];
                        ind++;
                    }
                }
            }
        }
        if (ind == numCourses) return res;
        else return new int[0];
    }
}