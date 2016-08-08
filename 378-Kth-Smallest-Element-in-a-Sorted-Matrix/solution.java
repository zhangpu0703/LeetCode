public class Solution {
    class Element{
        int val, x, y;
        public Element(int val, int x, int y){
            this.val = val;
            this.x = x;
            this.y = y;
        }
    }
    private Comparator<Element> comp = new Comparator<Element>(){
        public int compare(Element a, Element b){
            return a.val - b.val;
        }
    };
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Element> queue = new PriorityQueue<Element>(k,comp);
        for (int j=0; j<matrix[0].length; j++) queue.offer(new Element(matrix[0][j],0,j));
        for (int i=0; i<k-1; i++){
            Element cur = queue.poll();
            if (cur.x<matrix.length-1) queue.offer(new Element(matrix[cur.x+1][cur.y],cur.x+1,cur.y));
        }
        return queue.peek().val;
    }
}