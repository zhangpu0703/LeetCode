public class Solution {
    public int calculate(String s) {
        int sign = 1;
        int res = 0;
        int num = 0;
        Stack<Integer> numstack = new Stack<>();
        Stack<Integer> signstack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)) num = num*10+c-'0';
            if (c == '+') {
                res += num*sign;
                sign = 1;
                num = 0;
            }
            if (c == '-') {
                res += num*sign;
                sign = -1;
                num = 0;
            }
            if (c == '('){
                signstack.push(sign);
                numstack.push(res);
                res = 0;
                sign = 1;
            }
            if (c == ')'){
                res += num*sign;
                res *= signstack.pop();
                res += numstack.pop();
                num = 0;
            }
        }
        res += sign*num;
        return res;
    }
}