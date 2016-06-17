public class Solution {
    public int countDigitOne(int n) {
        int res = 0;
        int num = n;
        int x = 1;
        while (num>0){
            int remain = num%10;
            num /= 10;
            res += num*x;
            if (remain == 1) res+=1+n%x;
            else if (remain>1) res+=x;
            x*=10;
        }
        return res;
    }
}