public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<String>();
        for (int i=0; i<digits.length(); i++){
            char[] cur = map[digits.charAt(i)-'0'].toCharArray();
            if (res.size()==0) res.add("");
            List<String> list = new ArrayList<String>();
            for (int j=0; j<cur.length; j++){
                
                for (String s : res){
                    list.add(s+cur[j]);
                }
            }
            res = new ArrayList<String>(list);
        }
        return res;
    }
}