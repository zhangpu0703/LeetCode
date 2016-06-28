public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<>();
        if (numRows==0) return res;
        path.add(1);
        helper(res,numRows,0,path);
        return res;
    }
    public void helper(List<List<Integer>> res, int numRows, int start, List<Integer> path){
        if (start>=numRows) return;
        res.add(path);
        List<Integer> copy = new ArrayList<>();
        copy.add(1);
        for (int i=0; i<path.size(); i++){
            if (i==path.size()-1) copy.add(1);
            else{
                copy.add(path.get(i)+path.get(i+1));
            }
        }
        path = new ArrayList<>(copy);
        
        helper(res,numRows,start+1,path);
    }
}