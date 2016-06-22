public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        if (m==0) return true;
        int[] counts = new int[numCourses];
        for (int i=0; i<m; i++){
            counts[prerequisites[i][0]]++;
        }
        int can = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i=0; i<numCourses; i++){
            if (counts[i]==0) {
                queue.offer(i);
                can++;
            }
        }
        while (!queue.isEmpty()){
            int cur = queue.poll();
            for (int i=0; i<m; i++){
                if (prerequisites[i][1]==cur){
                    counts[prerequisites[i][0]]--;
                    if (counts[prerequisites[i][0]] == 0) {
                        queue.offer(prerequisites[i][0]);
                        can++;
                    }
                }
            }
        }
        return can == numCourses;
        
    }
}