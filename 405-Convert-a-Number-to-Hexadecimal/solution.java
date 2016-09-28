public class Solution {
    public String toHex(int num) {
        List<Character> list = new ArrayList<>();
        for (char c='0'; c<='9'; c++) list.add(c);
        for (char c='a'; c<='f'; c++) list.add(c);
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            sb.append(list.get(num & 15));
            num>>>=4;
        }
        if (sb.length() == 0) return "0";
        String res = sb.reverse().toString();
        return res;
    }
}