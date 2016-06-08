public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<Integer>();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;
            nums.add(i);
        }
        StringBuilder sb = new StringBuilder();
        k--;
        for(int i=1; i<=n; i++){
            fact= fact/(n-i+1);
            int cur = k/fact;
            sb.append(nums.get(cur));
            nums.remove(cur);
            k = k%fact;
        }
        return sb.toString();
    }
    public int factorial(int n){
        int res =1;
        for (int i=n;i>0; i--){
            res*=n;
        }
        return res;
    }
}