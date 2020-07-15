package ex.algo.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        insert(new int[][] {{1,5}}, new int[]{6,8});
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new LinkedList<>();
        if (intervals.length == 0){
            res.add(newInterval);
            return res.toArray(new int[0][]);
        }
        int i = 0;
        // skip (and add to output) all intervals that come before the 'newInterval'
        while (i < intervals.length && intervals[i][1] < newInterval[0])
            res.add(intervals[i++]);
        // merge all intervals that overlap with 'newInterval'
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        // insert the newInterval
        res.add(newInterval);
        // add all the remaining intervals to the output
        while (i < intervals.length)
            res.add(intervals[i++]);
        return res.toArray(new int[0][]);
    }
}
