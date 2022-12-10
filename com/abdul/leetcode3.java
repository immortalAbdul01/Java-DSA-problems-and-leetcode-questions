package com.abdul;

import java.util.Arrays;

public class leetcode3 {
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        int start = 0;
        int end = n - 1;

        while(start < end){
            ans[start] = start + 1;
            ans[end] = ans[start] * (-1);
            start++;
            end--;
        }

        return ans;


    }
    public static boolean canJump(int[] nums) {
        boolean flag = false;
        if(nums.length<2){
            return  true;
        }
        for (int i = 0; i <nums.length ; i++) {
            if((nums.length-1)-nums[i]<=0){
                return true;
            }

        }







        return flag;

    }
    public static boolean canJump2(int[] nums) {
        int last = nums.length-1;

        for(int i = nums.length-1 ; i>=0 ; i--){
            if(i+nums[i]>=last){
                last =i;
            }
        }
        return last==0;
    }
    public static  int rob(int[] nums) {
        int ans = 0;
        int ans2 = nums[0];
        if (nums.length < 3) {
            return Math.max(nums[nums.length-1],nums[0]);
        }
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        for (int i = 2; i < nums.length; i += 2) {
            ans2 += nums[i];
        }
        return Math.max(ans, ans2);
    }

        public static void main(String[] args) {
        int arr []={1,2};
        System.out.println(rob(arr));
    }
}
