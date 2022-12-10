package com.abdul;

import java.util.Arrays;

public class leetcode15Nov {
    public  static  void sortColors(int[] nums) {
        int low = 0;
        int high=nums.length-1;
        while(low<=high){
            if(nums[low]>nums[high]){
                swap(nums,low,high);
            }

            if(nums[high]!=1){
                high--;
            }
            low++;

        }
        System.out.println(Arrays.toString(nums));
    }
    public static int[] rotate(int nums[],int k){
    int n = nums.length-k;
    int ans[]=new int[nums.length];
    ans[k]=nums[0];
        if(k%2==0){
        ans[ans.length-1]=nums[k+1];
    }
        else ans[ans.length-1]=nums[k];

        for(int i = 0 ; i<=k;i++){
        ans[i]=nums[n];
        n++;
        if(n==nums.length){
            break;
        }



    }
        for (int i = 1; i <k;i++) {
        ans[k+i]=nums[i];

    }

      return ans;
    }
    public static void swap(int [ ]arr , int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    public static void main(String[] args) {
     int arr[] ={-1,-100,3,99};
        System.out.println(Arrays.toString(rotate(arr,2)));
    }
}
