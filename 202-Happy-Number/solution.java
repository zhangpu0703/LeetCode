public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n!=1){
            if (set.contains(n)) return false;
            set.add(n);
            int next = 0;
            while(n>0){
                next+=(n%10)*(n%10);
                n/=10;
            }
            n=next;
        }
        return n==1;
    }
}