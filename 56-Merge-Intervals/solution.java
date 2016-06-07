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
    public Comparator<Interval> IntervalCompare = new Comparator<Interval>(){
        public int compare(Interval a, Interval b){
            if (a.start!=b.start) return a.start-b.start;
            else return a.end-b.end;
        }
    };
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, IntervalCompare);
        List<Interval> res = new ArrayList<Interval>();
        if (intervals.size()==0) return res;
        Interval cur = intervals.get(0);
        for (int i=1; i<intervals.size(); i++){
            int left = intervals.get(i).start;
            int right = intervals.get(i).end;
            if (left > cur.end) {
                res.add(cur);
                cur = intervals.get(i);
            }
            else{
                cur.end = Math.max(cur.end,right);
            }
        }
        res.add(cur);
        return res;
    }

}
