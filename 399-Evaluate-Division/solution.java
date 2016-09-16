public class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        HashMap<String,HashMap<String,Double>> map = new HashMap<String,HashMap<String,Double>>();
        for (int i=0; i<equations.length; i++){
            String[] cur = equations[i];
            HashMap<String,Double> first = new HashMap<String,Double>();
            HashMap<String,Double> second = new HashMap<String,Double>();
            if (map.containsKey(cur[0])) first = map.get(cur[0]);
            if (map.containsKey(cur[1])) second = map.get(cur[1]);
            first.put(cur[1],values[i]);
            second.put(cur[0],1/values[i]);
            map.put(cur[0],first);
            map.put(cur[1],second);
        }
        double[] res = new double[queries.length];
        for (int i=0; i<queries.length; i++){
            String start = queries[i][0];
            String end = queries[i][1];
            HashSet<String> visited = new HashSet<String>();
            res[i] = helper(map,visited,start,end,1.0);
        }
        return res;
    }
    
    public double helper(HashMap<String,HashMap<String,Double>> map, HashSet<String> visited, String start, String end, Double res){
        if (!map.containsKey(start) || !map.containsKey(end) || visited.contains(start)) return -1.0;
        if (start.equals(end)) return res;
        visited.add(start);
        HashMap<String,Double> cur = map.get(start);
        for (String s : cur.keySet()){
            double val = helper(map,visited,s,end,res*cur.get(s));
            if (val != -1.0) return val;
        }
        visited.remove(start);
        return -1.0;
    }
}