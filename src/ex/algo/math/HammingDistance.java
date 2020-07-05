package ex.algo.math;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));

    }


    public static int hammingDistance(int x, int y) {
        char[] x1 = String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0").toCharArray();
        char[] y1 = String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0").toCharArray();
        int distance = 0;

        for (int i = 0; i < x1.length; i++) {
            if(x1[i] != y1[i]) distance++;
        }
        return distance;
    }
}
