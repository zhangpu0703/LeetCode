public class Solution {
    public int nthUglyNumber(int n) {
        int two = 0;
        int three = 0;
        int five = 0;
        int[] res = new int[n];
        res[0]=1;
        for (int i=1; i<n; i++){
            int curtwo = res[two]*2;
            int curthree =res[three]*3;
            int curfive = res[five]*5;
            int cur = Math.min(curtwo, Math.min(curthree, curfive));
            res[i]=cur;
            if (cur==curtwo) two++;
            if (cur==curthree) three++;
            if (cur==curfive) five++;
            
        }
        return res[n-1];
    }
}