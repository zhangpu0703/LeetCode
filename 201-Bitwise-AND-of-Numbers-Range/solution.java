public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m==n) return m;
        int dig = 0;
        while(m!=n){
            m>>=1;
            n>>=1;
            dig++;
        }

        return m<<dig;
    }
}