package leetcode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {8,8,7,7,7};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}