package leetcode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int [] arr = {4,4,1,6,2,2,1,6,3};
        System.out.println(singleNumber2(arr));
    }
    public static int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length;i++) {

         if(checkNumber(nums[i],i,nums))
             return nums[i];
        }
        return -1;
    }

    private static boolean checkNumber(int num, int i,int [] arr) {
        for (int j = 0; j < arr.length; j++) {
            if(i!=j&&arr[j]==num){
                return false ;
            }

        }
        return true;
    }

    // more better solutions


    public static int singleNumber2(int [ ]  nums){
        Arrays.sort(nums);

        for (int i = 0; i <nums.length-1 ; i+=2) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }

        }
        return nums[nums.length-1];
    }
}
