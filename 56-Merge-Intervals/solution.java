/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    private Comparator<Interval> intervalComp = new Comparator<Interval>(){
        public int compare (Interval a, Interval b){
            if (a.start == b.start) return a.end-b.end;
            return a.start - b.start;
        }   
    };
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) return intervals;
        Collections.sort(intervals,intervalComp);
        Interval cur = intervals.get(0);
        List<Interval> res = new ArrayList<Interval>();
        for (int i=1; i<intervals.size(); i++){
            Interval temp = intervals.get(i);
            if (temp.start<=cur.end) cur.end = Math.max(cur.end,temp.end);
            else{
                res.add(cur);
                cur = temp;
            }
        }
        res.add(cur);
        return res;
    }
}