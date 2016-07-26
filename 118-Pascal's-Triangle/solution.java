public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) return res;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        for (int i=2; i<=numRows; i++){
            List<Integer> last = res.get(res.size()-1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j=0; j<last.size()-1; j++){
                cur.add(last.get(j)+last.get(j+1));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }
    
}