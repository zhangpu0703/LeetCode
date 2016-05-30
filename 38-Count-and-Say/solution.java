public class Solution {
    public String countAndSay(int n) {
        if (n==1) return "1";
        String prev = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<prev.length()){
            int curLen = 1;
            while (i<prev.length()-1 && prev.charAt(i)==prev.charAt(i+1)){
                i++;
                curLen++;
            }
            sb.append(curLen);
            sb.append(prev.charAt(i));
            i++;
        }
        return sb.toString();
    }
}