public class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0; i<=heights.length; i++){
            int cur;
            if (i!=heights.length) cur = heights[i];
            else cur = 0;
            while (!stack.isEmpty() && cur<heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w;
                if (stack.isEmpty()) w = i;
                else w = i-stack.peek()-1;
                res = Math.max(res,h*w);
            }
            stack.push(i);
        }
        return res;
    }
}