package ex.algo.core;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        totalFruit(new int[]{0,1,2,2});
    }

    public static int totalFruit(int[] tree) {
        int length = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < tree.length; windowEnd++) {
            basket.put(tree[windowEnd], basket.getOrDefault(tree[windowEnd], 0) + 1);

            while (basket.size() > 2) {
                basket.put(tree[windowStart], basket.get(windowStart)-1);
                if (basket.get(tree[windowStart]) == 0) {
                    basket.remove(tree[windowStart]);
                }
                windowStart++; // shrink the window
            }

            length = Math.max(length, windowEnd - windowStart + 1);
        }
        return length;
    }
}
