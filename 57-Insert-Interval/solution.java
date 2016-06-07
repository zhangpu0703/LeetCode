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
        List<Interval> out = new ArrayList<Interval>();
        int n = intervals.size();
        if (n==0) return out;
        int left = newInterval.start;
        int right = newInterval.end;
        for (int i=0; i<intervals.size(); i++){
            Interval cur = intervals.get(i);
            if (left<cur.start) intervals.add(i,newInterval);
        }
        if (intervals.size()==n) intervals.add(newInterval);
        Interval pp = intervals.get(0);
        for (int i=0; i<intervals.size(); i++){
            left = intervals.get(i).start;
            right = intervals.get(i).end;
            if (left > pp.end) {
                out.add(pp);
                pp = intervals.get(i);
            }
            else{
                pp.end = Math.max(pp.end,right);
            }
        }
        out.add(pp);
        return out;
    }
}