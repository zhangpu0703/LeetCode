public class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i<n; i++){
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        int res = 0;
        boolean odd = false;
        for (Character c : map.keySet()){
            int cur = map.get(c);
            if (cur%2 == 1) {
                odd = true;
                res+=cur-1;
            }
            else res+=cur;
        }
        if (odd) return res+1;
        else return res;
    }
}