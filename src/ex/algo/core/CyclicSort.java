package ex.algo.core;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 5, 4, 2 };
        CyclicSort.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[] { 2, 6, 4, 3, 1, 5 };
        CyclicSort.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[] { 1, 5, 6, 4, 3, 2 };
        CyclicSort.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i+1){
                swap(i, nums[i] - 1, nums);
            }
        }
    }
    public static void swap(int i, int k, int[] nums){
        int m = nums[i];
        nums[i] = nums[k];
        nums[k] = m;
    }
}
