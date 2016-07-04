public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0; i<tokens.length; i++){
            String cur = tokens[i];
            
            if (cur.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            }
            else if (cur.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if (cur.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            }
            else if (cur.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else stack.push(Integer.parseInt(cur));
        }
        return stack.pop();
    }
}