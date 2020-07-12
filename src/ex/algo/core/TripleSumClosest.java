package ex.algo.core;

import java.util.Arrays;

public class TripleSumClosest {
    public static void main(String[] args) {
        threeSumClosest(new int[]{-1,2,1,-4}, 1);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int smallerDiff = Integer.MAX_VALUE;
        int smallerSum = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int targetDiff = target - nums[i] - nums[left] - nums[right];
                int currentSum = nums[i] + nums[left] + nums[right];
                if(targetDiff == 0){
                    return currentSum;
                }

                if(smallerDiff > Math.abs(targetDiff)) {
                    smallerDiff = Math.abs(targetDiff);
                    smallerSum = currentSum;
                }

                if(targetDiff>0){
                    left++;
                }else right--;

            }
        }
        return smallerSum;
    }
}
