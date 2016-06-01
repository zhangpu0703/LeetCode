public class Solution {
    public int trap(int[] height) {
        int left=0;
        int right = height.length-1;
        while (left<right && height[left+1]>=height[left]) left++;
        while (left<right && height[right-1]>=height[right]) right--;
        int area = 0;
        while (left<right){
            int lheight = height[left];
            int rheight = height[right];
            if (lheight<rheight){
                while (left<right && height[left+1]<lheight){
                    left++;
                    area+=lheight-height[left];
                }
            }
            if (left<right && height[left+1]>=lheight) left++;
            else{
                while (left<right && height[right-1]<rheight){
                    right--;
                    area+=rheight-height[right];
                }
            }
            if (left<right && height[right-1]>=rheight) right--;
        }
        return area;
    }
}