public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) return res;
        if (numRows == 1){
            List<Integer> one = new ArrayList<Integer>();
            one.add(1);
            res.add(one);
            return res;
        }
        res = generate(numRows-1);
        List<Integer> last = res.get(res.size()-1);
        List<Integer> newLine = new ArrayList<>();
        newLine.add(1);
        for(int i=0; i<last.size()-1;i++){
            newLine.add(last.get(i)+last.get(i+1));
        }
        newLine.add(1);
        res.add(newLine);
        return res;
    }
}