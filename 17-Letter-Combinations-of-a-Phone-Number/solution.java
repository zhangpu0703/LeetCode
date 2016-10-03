public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<String>();
        for (int i=0; i<digits.length(); i++){
            if (res.size()==0)  res.add("");
            String next = map[digits.charAt(i)-'0'];
            for (int j=0; j<res.size(); j++){
                for (int k=0; k<next.length(); k++){
                    System.out.println(res.get(j));
                    res.add(res.get(j)+next.charAt(k));
                }
            }
        }
        return res;
    }
}