public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (n!=1){
            if (set.contains(n)) return false;
            int sum = 0;
            while (n>0){
                sum+=n%10*n%10;
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}