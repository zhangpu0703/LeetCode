public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        if (s.length()==0) return 0;
        int res = map.get(s.charAt(s.length()-1));
        for (int i=s.length()-2; i>=0; i--){
            int cur = map.get(s.charAt(i));
            int last = map.get(s.charAt(i+1));
            if (cur<last) res-=cur;
            else res+=cur;
        }
        return res;
    }
}