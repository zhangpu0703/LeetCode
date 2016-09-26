public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] counts = new int[numCourses];
        int[] res = new int[numCourses];
        int ind = 0;
        for (int i=0; i<prerequisites.length; i++){
            counts[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i=0; i<numCourses; i++){
            if (counts[i]==0) {
                queue.offer(i);
                res[ind++]=i;
            }
        }
        while (!queue.isEmpty()){
                int cur = queue.poll();
                for (int j=0; j<prerequisites.length; j++){
                    if (prerequisites[j][1]==cur){
                        counts[prerequisites[j][0]]--;
                        if (counts[prerequisites[j][0]] == 0){
                            queue.offer(prerequisites[j][0]);
                            res[ind++]=prerequisites[j][0];
                        }
                    }
                }
        }
        if (ind == numCourses) return res;
        else return new int[0];
    }
}