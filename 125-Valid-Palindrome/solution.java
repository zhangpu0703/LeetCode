public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s=s.toLowerCase();
        for (char c : s.toCharArray()){
            if ('0'<=c && c<='9') sb.append(c);
            else if ('a'<=c && c<='z') sb.append(c);
        }
        String a = sb.toString(), b= sb.reverse().toString(); 
        return a.equals(b);
    }
}