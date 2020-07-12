package ex.algo.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] != nums[i-1])
                continue;
            findPairs(nums, -nums[i], i+1, triplets);
        }
        return triplets;
    }
    
    public static void findPairs(int[] nums, int target, int startIndex, List<List<Integer>> triplets){
        int endIndex = nums.length-1;
        while(startIndex<endIndex){
            if(nums[startIndex]+nums[endIndex] == target){
                triplets.add(Arrays.asList(nums[startIndex], nums[endIndex], -target));
                startIndex++;
                endIndex--;
                while(startIndex<endIndex && nums[startIndex] == nums[startIndex+1]){
                    startIndex++;
                }
                while(startIndex<endIndex && nums[endIndex] == nums[endIndex-1]){
                    endIndex--;
                }
            } else if(nums[startIndex]+nums[endIndex] > target)
                endIndex--;
            else startIndex++;
        }
    }
}
