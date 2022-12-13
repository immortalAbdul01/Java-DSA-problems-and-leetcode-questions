package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,2,3};
        System.out.println(targetIndices(arr,2));

    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                list.add(i);
            }

        }
        return list;
    }
}
