package ex.algo.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(num.containsKey(target-nums[i])){
                return new int[]{num.get(target-nums[i]), i};
            } else
                num.put(nums[i], i);
        }
        return new int[]{};
    }
}
