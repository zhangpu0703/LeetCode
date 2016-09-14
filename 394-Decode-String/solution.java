public class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        Stack<String> strs = new Stack<String>();
        int i = 0;
        String str = "";
        while (i < s.length()){
            if (Character.isDigit(s.charAt(i))){
                int num = 0;
                while(Character.isDigit(s.charAt(i))){
                    num = num*10 + s.charAt(i)-'0';
                    i++;
                }
                nums.push(num);
            }
            else if (s.charAt(i)=='['){
                strs.push(str); 
                str = "";
                i++;
            }
            else if (s.charAt(i)==']'){
                String cur = strs.pop();
                int times = nums.pop();
                StringBuilder sb = new StringBuilder();
                sb.append(cur);
                for (int j=0; j<times; j++){
                    sb.append(str);
                }
                str = sb.toString();
                i++;
            } 
            else{
                str = str+s.charAt(i);
                i++;
            }
        }
        return str;
    }
}