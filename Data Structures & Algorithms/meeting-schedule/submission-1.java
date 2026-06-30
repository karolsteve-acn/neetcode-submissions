/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty()) return true;
        intervals.sort((l, r) -> Integer.compare(l.start, r.start));
        int t = 0;
        for(Interval i : intervals) {
            if(i.start < t) {
                return false;
            }
            t = Math.max(t, i.end);
        }
        return true;
    }
}
