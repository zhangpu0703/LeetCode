public class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if ((c>='a' && c <='z') || (c>='0' && c <='9')){
                sb.append(c);
            }
        }
        String first = sb.toString();
        return sb.reverse().toString().equals(first);
    }
}