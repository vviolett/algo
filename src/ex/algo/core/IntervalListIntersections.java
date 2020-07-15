package ex.algo.core;

import java.util.LinkedList;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args) {
        intervalIntersection(new int[][]{{0,2},{5, 10}, {13, 23}, {24, 25}},
                new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}});
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new LinkedList<>();
        int i = 0, j = 0;
        while(i!= A.length && j!= B.length){
            int low = Math.max(A[i][0], B[j][0]);
            int high = Math.min(A[i][1], B[j][1]);

            if(low<=high){
                res.add(new int[]{low, high});
            }
            if(A[i][1]<B[j][1]){
                i++;
            } else j++;

        }
        return res.toArray(new int[0][]);
    }
}
