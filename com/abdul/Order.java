package com.abdul;

import java.util.Arrays;

public class Order {
    public static int[] productExceptSelf(int[] nums) {
        // dangerous method
        if(nums.length==0) return new int [] {};
        int rp = 1;
        int result[] = new int[nums.length];
        for(int i = 0 ; i <nums.length;i++){
            result[i] =rp;
            rp*=nums[i];
        }
        rp=1;
        for(int i = nums.length-1;i>=0;i--){
            result[i]*=rp;
            rp*=nums[i];
        }
        return result;
    }
    public static int[] buildArray(int[] nums) {
        int ans [] = new int [nums.length];
        for(int i = 0 ; i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }

        return ans;
    }
    public static int maxSubArray(int[] nums) {
        int ans= 0;
        int sum = nums[0];
        int j = 1;
        for (int i = 1; i < nums.length-1; i++) {
            sum+=nums[i];
            ans=sum;
            sum=0;
        }
        for (int i = 0; i < nums.length; i++) {
            for ( j = 1; j < nums.length;j++) {
                while(sum<=ans){
                    sum+=nums[j];

                }


            }

            if(ans<sum){
                ans=sum;

            }
            sum=0;


        }
        return ans;

    }
    public static int maxSubArray2(int[] nums) {
        // Intelligent Code by someone wow
        int maxSum=nums[0];
        int currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;

    }

    static int getProduct(int arr[], int start, int end){
        int product= 1;
        for (int i = start; i <end ; i++) {
            product*=arr[i];

        }
        return product;
    }
    public static void main(String[] args) {
        int arr []={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(arr));
    }
}
