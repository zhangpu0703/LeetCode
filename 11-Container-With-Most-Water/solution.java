public class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int start = 0, end = height.length-1;
        while (start<end){
            int h = 0, w = end-start;
            if (height[start]<height[end]) h=height[start++];
            else h = height[end--];
            res= Math.max(h*w,res);
        }
        return res;
    }
}