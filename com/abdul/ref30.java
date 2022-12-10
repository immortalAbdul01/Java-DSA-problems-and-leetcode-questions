package com.abdul;

import java.util.Arrays;

public class ref30 {
    public static void main(String[] args) {
        System.out.println("yes this is tutorial 30 and it is working ");
int arr[]={2,3,4,68,9,0,-2,4,7,1,7};
int arr2[][]={{2,3,4,5},{21,311,51,71}};
int arr3[]={12,345,2,6,7896};
        System.out.println(even(arr3));
//        System.out.println(linearSearch(arr,7));
//        System.out.println(SearchInRange(arr,2,6,4));
//        System.out.println(min(arr));
        int ans [] =searchIn2d(arr2,71);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(max(arr2));
    }


    static int linearSearch(int arr[],int target){
        if(arr.length<1){
            return -1;
        }
        for(int i = 0 ; i< arr.length;i++){
            if (arr[i] == target) {

                return i;
            }
        }
        return -1;
    }
    static boolean LinearSearchS(String name , char  a ){
        if(name.length()<1){
            return false;
        }
        for (int i = 0 ;i<name.length();i++){
            if(name.charAt(i)==a){
                return true;
            }
        }
        return false;
    }
    static boolean SearchInRange(int arr[], int start , int end ,int target){
        if(start<0){
            return false;
        }
        if(end> arr.length-1){
            return false;
        }
        for(int i =start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
static int min (int arr[]){
        int min = arr[0];
        if(arr.length==1){
            return min;
        }
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];

            }

        }
        return min;
}
static int[] searchIn2d(int [][]arr, int target){
        for(int i = 0 ; i<arr.length;i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }

            }
       return new int [] {-1,-1};

}
static int max(int arr[][]){
        int max=arr[0][0];
    for (int[] ints : arr) {
        for (int anInt : ints) {
            if (anInt > max) {
                max = anInt;
//                    return max;
            }
        }
    }
        return max;
}
static int even(int arr[]){
        int eve=0;
        for(int i= 0 ; i<arr.length;i++){

            if((int)(Math.log10(arr[i])+1)%2==0){
                eve++;
            }
        }
        return eve;
}
static  int maxWealth(int arr[][]){
        int ans=0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0 ;
            for(int j =0 ; j<arr[i].length;j++) {
                sum+=arr[i][j];

            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
}
}
