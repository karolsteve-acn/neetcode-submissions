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
        if(intervals == null || intervals.isEmpty()) return true;
        Collections.sort(intervals, (l, r) -> l.start - r.start);
        for(int i = 0; i < intervals.size() - 1; i++) {
            if(intervals.get(i).end > intervals.get(i + 1).start) return false;
        }
        return true;
    }
}
