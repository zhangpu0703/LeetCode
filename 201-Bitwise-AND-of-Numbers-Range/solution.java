public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m==n) return m;
        int dig = 0;
        while(m!=n){
            m>>=1;
            n>>=1;
            dig++;
        }
        while(dig>0){
            m<<=1;
        }
        return m;
    }
}