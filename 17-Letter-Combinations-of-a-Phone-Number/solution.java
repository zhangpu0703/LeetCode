public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<String>();
        for (int i=0; i<digits.length(); i++){
            String letters = map[digits.charAt(i)-'0'];
            if (res.size()==0) res.add("");
            for (int k=0; k<res.size(); k++){
                for (int j=0; j<letters.length(); j++){
                    String newString = res.get(k)+letters.charAt(j);
                    res.add(newString);
                }
            }
        }
        return res;
    }
}