public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int res = 0;
        while (left<right){
            int h = Math.min(height[left],height[right]);
            res = Math.max(res,(right-left)*h);
            if (height[left]<height[right]) left++;
            else right--;
        }
        return res;
    }
}