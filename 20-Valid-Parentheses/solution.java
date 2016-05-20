public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i=0; i<c.length; i++){
            if (stack.isEmpty()){
                if (c[i]==')' || c[i]==']'|| c[i]=='}') return false;
            }
            
            if (c[i]=='(' || c[i]=='['|| c[i]=='{') stack.push(c[i]);
            
            if (c[i]==')'){
                if (stack.pop() != '(') return false;
            }
            if (c[i]==']'){
                if (stack.pop() != '[') return false;
            }
            if (c[i]=='}'){
                if (stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}