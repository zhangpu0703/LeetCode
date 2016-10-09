public class Solution {
    public String addStrings(String num1, String num2) {
        int m = num1.length()-1, n = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (m>=0 || n>=0){
            int a = 0, b = 0;
            if (m>=0) a = num1.charAt(m--)-'0';
            if (n>=0) b = num2.charAt(n--)-'0';
            int cur = a+b+carry;
            sb.append(cur%10);
            carry = cur/10;
        }
        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}