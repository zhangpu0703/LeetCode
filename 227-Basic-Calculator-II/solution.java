public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int i=0;
        int cur = 0;
        char operator = '+'; 
        while (i<s.length()){
            if (Character.isDigit(s.charAt(i))){
                cur= cur*10+s.charAt(i)-'0';
            }
            else if (s.charAt(i) == ' ') continue;
            else{
                if (operator == '+') stack.push(cur);
                else if (operator == '-') stack.push(-cur);
                else if (operator == '*') stack.push(stack.pop()*cur);
                else if (operator == '/') stack.push(stack.pop()/cur);
                cur = 0;
                operator =s.charAt(i);
            }
            i++;
        }
        int res = 0;
        while (!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}