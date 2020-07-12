package ex.algo.core;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3}, 19);

    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            if(product<k){
                count++;
            }
            int next = i+1;
            while (next < nums.length) {
                product *= nums[next++];
                if(product<k){
                    count++;
                } else break;
            }

        }
        return count;
    }
}
