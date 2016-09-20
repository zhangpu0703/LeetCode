public class NumArray {
    class SegmentTreeNode{
        int start, end;
        int sum;
        SegmentTreeNode left, right;
        public SegmentTreeNode(int start, int end, int sum){
            this.start = start;
            this.end = end;
            this.sum = sum;
        }
    }
    
    public SegmentTreeNode buildTree(int start, int end, int[] A){
        if (start>end) return null;
        SegmentTreeNode node = new SegmentTreeNode(start,end,0);
        if (start == end) node.sum = A[start];
        else{
            int mid = start+(end-start)/2;
            node.left = buildTree(start,mid,A);
            node.right = buildTree(mid+1,end,A);
            node.sum = node.left.sum + node.right.sum;
        }
        return node;
    }
    
    public void modify (SegmentTreeNode root, int i, int val){
        if (root == null) return;
        if (root.start == i && root.end == i) {
            root.sum = val;
            return;
        }
        int mid = root.start+(root.end-root.start)/2;
        if (mid>=i) modify(root.left,i,val);
        else modify(root.right,i,val);
        root.sum = root.left.sum+root.right.sum;
    }
    
    public int query (SegmentTreeNode node, int i, int j){
        if (node.start == node.end) return node.sum;
        int mid = node.start+(node.end-node.start)/2;
        if (j<=mid) return query (node.left, i, j);
        else if (i<=mid && j>mid) return query(node.left,i,mid)+query(node.right,mid+1,j);
        else return query(node.right,i,j);
    }
    
    SegmentTreeNode root;

    public NumArray(int[] nums) {
        root = buildTree(0,nums.length-1,nums);
    }

    void update(int i, int val) {
        modify(root,i,val);
    }

    public int sumRange(int i, int j) {
        return query(root,i,j);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);