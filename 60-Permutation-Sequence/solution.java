public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int fact = 1;
        List<Integer> unused = new ArrayList<Integer> ();

        for (int i=1; i<=n; i++){
            fact*=i;
            unused.add(i);
        }
        k--;
        for (int j=1; j<=n; j++){
            fact=fact/(n-j+1);
            int first = k/fact;
            sb.append(String.valueOf(unused.get(first)));
            unused.remove(first);
            k=k%fact;
        }
        return sb.toString();
    }
}