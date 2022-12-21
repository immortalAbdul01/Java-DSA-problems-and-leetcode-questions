package leetcode;

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {
    int [] arr ={100,3,2,1};
        System.out.println(maximumGap(arr));
    }

        public static int maximumGap(int[] nums) {
            Arrays.sort(nums);
            int i = 0 ;
            int diff = 0;
            while(i<nums.length-1){
                if(nums[i]<nums[i+1]){
                    if(nums[i+1]-nums[i]>diff){



                        diff=nums[i+1]-nums[i];

                    }

                }
                i++;

            }
            return diff;
        }
}
