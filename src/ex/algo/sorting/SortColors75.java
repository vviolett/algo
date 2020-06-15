package ex.algo.sorting;

public class SortColors75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

    public static void sortColors(int[] nums) {
        int temp;
        for (int k = nums.length - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                int j = i + 1;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
    }
}
