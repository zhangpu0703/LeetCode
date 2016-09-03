public class Solution {
    class Pair{
        int x, y, val;
        public Pair(int x, int y, int val){
            this.x=x;
            this.y=y;
            this.val = val;
        }
    }
    private Comparator<Pair> pairComp = new Comparator<Pair>(){
      public int compare (Pair a, Pair b){
          return a.val-b.val;
      }  
    };
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k,pairComp);
        for (int i=0; i<Math.min(matrix.length,k); i++){
            pq.offer(new Pair(i,0,matrix[i][0]));
        }
        for (int i=0; i<k-1; i++){
            Pair cur = pq.poll();
            if (cur.y<matrix[0].length-1) pq.offer(new Pair(cur.x,cur.y+1,matrix[cur.x][cur.y+1]));
        }
        return pq.peek().val;
    }
}