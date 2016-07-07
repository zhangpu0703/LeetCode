public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z==0) return true;
        if (gcd(x,y)==0) return false;
        return x>=z-y && z%gcd(x,y)==0;
    }
    public int gcd(int x, int y){
        while(y!=0){
            int temp = y;
            y= x%y;
            x = temp;
        }
        return x;
    }
}