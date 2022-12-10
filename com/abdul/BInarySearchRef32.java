package com.abdul;

import javax.swing.*;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class BInarySearchRef32 {

    public static void main(String[] args) {

        System.out.println("it is working");

        int arr3[]={-1,0,3,5,9,12};
        int arr[]={0,1,0};
//        System.out.println(MountainArray(arr));

//        int arr2[]={11,10,9,8,7,6,5,3,2,1};


        System.out.println(binarySearch23(arr3,2));
              }
    static boolean orderAgnosticBinary(int arr[]){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]){
            return true;
        }
        else {
        return     false;
        }

    }
    static char BinarySearch(char []arr, char target){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = start+end/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return arr[start%arr.length];
    }

   static  int[] firstAndLast(int nums [] ,int target){
        int [] ans = {-1,-1};
        ans[0]=index(nums,target, true);
        ans[1]=index(nums,target,false);
        return ans;
    }
    static int index(int nums [ ] ,int target , boolean fI){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start<=end){
            int mid=start+(end-start)/2;


                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    ans=mid;
                    if(fI){
                        end=mid-1;
                    }
                    else {
                        start=mid+1;
                    }
                }


        }
        return ans;
    }
    static int MountainArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid =(start+end) /2;


               if(arr[mid]>arr[mid+1]){
                   // we are in decreasing order
                   end=mid;
               }
               else {
                   start=mid+1;
               }



        }
        return arr[start];

    }
    static int SplitArray(int arr [],int m ){
        int start = 0 ;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];

        }
        while (start<end){
            int mid = start+(end-start)/2;
            int  sum = 0 ;
            int pieces=0;
            for (int j : arr) {
                if (sum + j > mid) {
                    sum = j;
                    pieces++;
                } else {
                    sum += j;
                }

            }
            if(pieces>m){
                start=mid+1;
            }
            else {
                end=mid;
            }

        }
        return end;
    }

    static int searchInMounTainArray(int arr[], int target){
        int peak = MountainArray(arr);
        int firstTry=BinarySearch2(arr,target,0,peak);
        if(firstTry!=-1) return firstTry;

        else return BinarySearch2(arr,target,peak,arr.length-1);
    }
    static int BinarySearch(int []arr,int target){
        int start = 0;
        int end = arr.length-1;

 while (start<=end){
     int mid=start+(end-start)/2;
if(orderAgnosticBinary(arr)) {


    if (arr[mid] < target) {
        start = mid + 1;
    } else if (arr[mid] > target) {
        end = mid - 1;
    } else {
        return mid;
    }
}

else {

    if (arr[mid] > target) {
        start = mid + 1;
    } else if (arr[mid] < target) {
        end = mid - 1;
    } else {
        return mid;
    }
}
 }
 return -1;
    }
    static int RBS(int nums[],int target){
        int pivot=pivotInRotated(nums);
        if(nums[pivot]==target){
            return pivot;

        }
        if(pivot==-1){
           return BinarySearch2(nums,target,0,nums.length-1)
            ;


        }
        if(nums[0]  <=target){
            return BinarySearch2(nums,target,0,pivot-1);
        }
         return BinarySearch2(nums,target,pivot+1,nums.length-1);

    }
    static int pivotInRotated(int arr[]){
        int start =0;
        int end =arr.length-1;
        while( start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;

            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;

            }
            else start=mid+1;
        }
        return -1;

    }
 static int BinarySearch2(int []arr,int target,int start , int end){


 while (start<=end){
     int mid=start+(end-start)/2;
if(orderAgnosticBinary(arr)) {


    if (arr[mid] < target) {
        start = mid + 1;
    } else if (arr[mid] > target) {
        end = mid - 1;
    } else {
        return mid;
    }
}

else {

    if (arr[mid] > target) {
        start = mid + 1;
    } else if (arr[mid] < target) {
        end = mid - 1;
    } else {
        return mid;
    }
}
 }
 return -1;
    }


static int celing(int []arr , int target){
        int start=0;
        int end = arr.length-1;


       while (start >= end) {
           int mid = (start + end) / 2;

           if (orderAgnosticBinary(arr)) {


               if (target > arr[mid]) {
                   start = mid + 1;
               } else if (target < arr[mid]) {
                   end = mid - 1;
               } else {

                   return arr[mid];
               }

           } else {
               if (target < arr[mid]) {
                   start=mid+1;


               }
               else if(target>arr[mid]){
                   end=mid-1;
               }
               else {
                   return arr[mid];
               }
           }
       }




return arr[end-1];









}
static int InfiniteArray(int arr[], int target){
        int start=0;
        boolean flag =false;
        int end=start+1;
        while(target>arr[end]){

            start=end+1;
            end*=2;
            flag=true;
        }


if(flag) {

    while (start <= end) {
        int mid = (start + end) / 2;


        if (target > arr[mid]) {
            start = mid + 1;
        } else if (target < arr[mid]) {
            end = mid - 1;
        } else {

            return mid;

        }
    }
}
    return -1;
    }




    static void pairs(int arr []) {
        int pairs = 0;

        int freq[] = new int[101];
        //sorting the array in ascending order first
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {


                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
    static int binarySearch23(int nums[],int target){
        int start = 0 ;
        int end= nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;

            }
            else if(target>nums[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }

}





