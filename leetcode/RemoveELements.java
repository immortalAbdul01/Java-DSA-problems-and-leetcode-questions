package leetcode;

import java.util.Arrays;

public class RemoveELements {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));

    }

        public static int removeElement(int[] nums, int val) {

                int l = nums.length;
                for (int i=0; i<l; i++) {
                    if (nums[i] == val) {
                        nums[i--] = nums[l-- -1];
                    }
                }
                return l;

        }

}
