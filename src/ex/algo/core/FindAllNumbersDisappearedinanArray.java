package ex.algo.core;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                swap(i, nums[i] - 1, nums);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                res.add(i+1);
            }
        }
        return res;
    }

    public static void swap(int i, int k, int[] nums){
        int m = nums[i];
        nums[i] = nums[k];
        nums[k] = m;
    }
}
