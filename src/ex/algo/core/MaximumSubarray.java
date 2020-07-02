package ex.algo.core;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{3,3,4,3,0}, 3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int windowStart = 0;
        double current = nums[0];
        double max = current;

        for (int windowEnd = 1; windowEnd <= nums.length-1; windowEnd++) {
            if (windowEnd <= k - 1) {
                current += nums[windowEnd];
                max = current/k;
            } else {
                current = current - nums[windowStart] + nums[windowEnd];
                max = Math.max(max, current/k);
                windowStart++;
            }
        }
        return max;

    }
}
