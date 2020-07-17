package ex.algo.core;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                swap(i, nums[i]-1, nums);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1)
                arr.add(nums[i]);
        }
        return new ArrayList<>(arr);
    }

    public static void swap(int i, int k, int[] nums){
        int m = nums[i];
        nums[i] = nums[k];
        nums[k] = m;
    }
}
