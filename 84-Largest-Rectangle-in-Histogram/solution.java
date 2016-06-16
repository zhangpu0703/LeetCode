public class Solution {
public int largestRectangleArea(int[] heights) {
        int res = 0;
        for (int i=0; i<heights.length; i++){
            int left = i-1;
            int right = i+1;
            int width = 1;
            while (left>=0 && heights[left]>=heights[i]){
                left--;
                width++;
            }
            while(right<heights.length && heights[right]>=heights[i]){
                right++;
                width++;
            }
            res = Math.max(res,width*heights[i]);
        }
        return res;
    }
}