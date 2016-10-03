public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Queue<String> queue = new LinkedList<String>();
        if (digits == null || digits.length() == 0) return new ArrayList<String>();
        queue.offer("");
        for (int i=0; i<digits.length(); i++){
            char[] letters = map[digits.charAt(i)-'0'].toCharArray();
            int size = queue.size();
            for (int j=0; j<size; j++){
                String cur = queue.poll();
                for (char c : letters){
                    queue.offer(cur+c);
                }
            }
        }
        return new ArrayList<String>(queue);
    }
}