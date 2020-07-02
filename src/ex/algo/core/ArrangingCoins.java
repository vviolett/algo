package ex.algo.core;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.print(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        int floor = 0;
        int val = n;
        if(n==1) return 1;
        for (int i = 1; i < n; i++) {
            val-=i;
            if(val<0) return floor;
            else floor++;
        }
        return floor;
    }
}
