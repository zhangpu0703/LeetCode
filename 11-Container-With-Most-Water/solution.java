public class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        if (height == null || height.length == 0) return 0;
        int right = height.length-1, left = 0;
        while (left<right){
            int w = right-left;
            int h = Math.min(height[left],height[right]);
            res = Math.max(res, h*w);
            if (h == height[left]) left++;
            else right--;
        }
        return res;
    }
}