public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        if (input.length()==0) {
            res.add(0);
            return res;
        }
        for (int i=0; i<input.length(); i++){
            char cur = input.charAt(i);
            if (cur=='+'||cur=='-'||cur=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for (int aa : left){
                    for (int bb : right){
                        if (cur=='+') res.add(aa+bb);
                        if (cur=='-') res.add(aa-bb);
                        if (cur=='*') res.add(aa*bb);
                    }
                }
            }
        }
        if (res.size()==0) res.add(Integer.parseInt(input));
        return res;
        
    }
}