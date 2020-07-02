package ex.algo.core;

public class MinimumSizeSubarraySum209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(new int[]{2,3,1,2,4,3}, 7));

    }

    public static int minSubArrayLen(int[] nums, int s) {
        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // add the next element
            // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
            while (windowSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
