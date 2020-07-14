package ex.algo.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

    }

    public void insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> res = new LinkedList<>();

        for (int[] interval: intervals){
            if(res.isEmpty() || newInterval[0] > res.getLast()[1]){
                res.add(interval);
            } else{


            }
        }

    }
}
