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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<Interval>();
        Interval cur = newInterval;
        boolean added = false;
        for (int i=0; i<intervals.size(); i++){
            int start = intervals.get(i).start, end = intervals.get(i).end;
            if (added){
                res.add(intervals.get(i));
                continue;
            }
            if (cur.end<start) {
                res.add(cur);
                added = true;
                res.add(intervals.get(i));
            }
            else if (cur.start>end) res.add(intervals.get(i));
            else {
                cur.start = Math.min(start,cur.start);
                cur.end = Math.max(end,cur.end);
            }
        }
        if (!added) res.add(cur);
        return res;
    }
}