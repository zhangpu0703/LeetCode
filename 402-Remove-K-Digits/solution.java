public class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        char[] nums = num.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        int remove = 0;
        for (int i=0; i<nums.length; i++){
            if (remove >= k) {
                stack.push(nums[i]);
                continue;
            }
            while (remove < k && !stack.isEmpty() && stack.peek()>nums[i]){
                stack.pop();
                remove++;
            }
            stack.push(nums[i]);
        }
        for (int i=remove; i<k; i++) stack.pop();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String res = sb.reverse().toString();
        if (res.length()==0) return "0";
        while (res.charAt(0) == '0'){
            if (res.length()==1) break;
            else res = res.substring(1);
        }
        return res;
    }
}