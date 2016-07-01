public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>0){
            if(n%26 == 0) {
                sb.append('Z');
                n=n/26-1;
            }
            else {
                sb.append((char) ('A'+n%26-1));
                n/=26;
            }
            
        }
        return sb.reverse().toString();
    }
}