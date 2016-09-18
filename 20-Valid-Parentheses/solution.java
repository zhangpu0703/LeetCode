public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i<s.length(); i++){
            char cur = s.charAt(i);
            if (cur == '(' || cur =='[' || cur == '{') stack.push(cur);
            else{
                if (stack.isEmpty()) return false;
                char prev = stack.pop();
                if (cur == ')'){
                    if (prev!='(') return false;
                }
                else if (cur == ']'){
                    if (prev!='[') return false;
                }
                else{
                    if (prev!='{') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}