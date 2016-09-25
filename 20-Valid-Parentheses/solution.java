public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            Character cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') stack.push(cur);
            if (cur == ')'){
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            if (cur == ']'){
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            if (cur == '}'){
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}