public class Solution {
    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i=0; i<strs.length; i++){
            String str = strs[i];
            if (str.equals(".")||str.length()==0) continue;
            else if (str.equals("..")){
                if (!stack.isEmpty()) stack.pop();
            }
            else stack.push(str);
        }
        List<String> list = new ArrayList<>();
        while (!stack.isEmpty()) list.add(stack.pop());
        
        if (list.size()==0) return "/";
        StringBuilder sb = new StringBuilder();
        for (int i=list.size()-1; i>=0; i--){
            sb.append("/").append(list.get(i));
        }
        return sb.toString();
    }
}