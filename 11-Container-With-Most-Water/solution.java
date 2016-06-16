public class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int width = height.length-1;
        int res = 0;
        while (start<end){
            res = Math.max(res,Math.min(height[start],height[end])*width);
            if (height[start]<height[end]) start++;
            else end--;
            width--;
        }
        return res;
    }
}