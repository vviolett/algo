package ex.algo.core;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

    }

    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i && nums[i] < nums.length){
                swap(i, nums[i], nums);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
                return i;
        }
        return 0;
    }

    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
