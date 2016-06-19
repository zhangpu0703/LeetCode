public class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i=1; i<=n; i++){
            sb.append(s.charAt(n-i));
        }
        String r = sb.toString();
        int end = n;
        while(end>0 && !s.substring(0,end).equals(r.substring(n-end))){
            end--;
        }
        sb = new StringBuilder();
        for (int i=end; i<n; i++){
            sb.append(s.charAt(i));
        }
        return sb.reverse().toString()+s;
    }
}