package ex.algo.core;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        findDuplicate(new int[]{1,3,4,2,2});
    }

    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i+1){
                if(nums[i] == nums[nums[i]-1]){
                    return nums[i];
                } else swap(i, nums[i]-1, nums);
            }
        }
        return -1;
    }

    public static void swap(int i, int k, int[] nums){
        int m = nums[i];
        nums[i] = nums[k];
        nums[k] = m;
    }
}
