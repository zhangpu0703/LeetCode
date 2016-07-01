public class Solution {
    public String countAndSay(int n) {
        if (n==1) return "1";
        String prev = countAndSay(n-1);
        int ind = 0;
        StringBuilder sb = new StringBuilder();
        while(ind<prev.length()){
            char cur = prev.charAt(ind);
            int count=0;
            while(ind<prev.length() && prev.charAt(ind)==cur){
                ind++;
                count++;
            }
            sb.append(count).append(cur);
            //ind++;
        }
        return sb.toString();
    }
}