class Dir{
    int length, level;
    boolean isFile;
    public Dir(int length, int level, boolean isFile){
        this.length = length;
        this.level = level;
        this.isFile = isFile;
    }
}
public class Solution {
    public int lengthLongestPath(String input) {
        HashMap<Integer, Dir> map = new HashMap<Integer,Dir>();
        String[] inputs = input.split("\n");
        /*
        String root = inputs[0];
        int level = root.lastIndexOf("\t") + 1;
        int length = root.length()-level+1;
        boolean isFile = false;
        if (root.indexOf(".") != -1) isFile = true;
        map.put(level, new Dir(length, level, isFile));
        
        if (isFile) res = root.length();
        */
        int res = 0;
        for (int i = 0; i<inputs.length; i++){
            String cur = inputs[i];
            int level = cur.lastIndexOf("\t") + 1;
            int length = cur.length()-level+1;
            if (map.containsKey(level-1)) length+=map.get(level-1).length;
            boolean isFile = false;
            if (cur.indexOf('.') != -1) {
                isFile = true;
                res = Math.max(length,res);
            }
            map.put(level,new Dir(length, level, isFile));
        }
        return res == 0 ? 0 : res-1;
        
    }
}