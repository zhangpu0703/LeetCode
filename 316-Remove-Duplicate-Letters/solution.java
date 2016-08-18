public class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<Character>();
        int[] counts = new int[26];
        Set<Character> visited = new HashSet<>();
        for (int i=0; i<s.length(); i++) counts[s.charAt(i)-'a']++;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            counts[c-'a']--;
            if (visited.contains(c)) continue;
            while (!stack.isEmpty() && stack.peek()>c && counts[stack.peek()-'a']>0){
                visited.remove(stack.pop());
            }
            stack.push(c);
            visited.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}