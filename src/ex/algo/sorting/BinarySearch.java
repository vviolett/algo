package ex.algo.sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr, 9));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int pivot = left + (right - left)/2;
            if(nums[pivot] == target) return pivot;
            if(nums[pivot] < target) left++;
                    else right--;
        }
        return -1;
    }
}
