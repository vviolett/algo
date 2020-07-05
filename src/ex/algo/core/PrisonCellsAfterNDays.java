package ex.algo.core;

import java.util.Arrays;

public class PrisonCellsAfterNDays {
    public static void main(String[] args) {
        prisonAfterNDays(new int[]{0,1,0,1,1,0,0,1}, 7);

    }

    public static int[] prisonAfterNDays(int[] cells, int N) {
        int[] res = new int[cells.length];

        for (int i = 1; i <= N; i++) {
            System.out.println(res);
            System.out.println(cells);
            for (int j = 1; j <= cells.length-2; j++) {
                res[j] = cells[j-1] == cells[j+1] ? 1 : 0;
            }
            cells[0] = 0;
            cells[cells.length-1] = 0;
            cells = Arrays.copyOf(res, res.length);
        }

        return res;
    }
}
