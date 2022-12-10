package com.abdul;

import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;
import java.util.ArrayList;

public class DSA19Nov {
    public static void main(String[] args) {
        int arr[]={911,4,911,911,9111};
        int arr2[]={5,6,7,8,1,2,3};

findAllIndex(arr,911,0);
        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex3(arr,0,911));
        System.out.println(RotatedBinarySearch(arr2,2,0, arr2.length-1));
    }
    static boolean SortedOrNot(int arr[],int s ){
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]<arr[s+1]){

            return SortedOrNot(arr,s+1);
        }
         return false;



    }
    static boolean sorted2(int arr [] , int s ){
        // more optimized way
        if(s==arr.length-1){
            return true;
        }
        return arr[s]<arr[s+1] && sorted2(arr,s+1);
    }
    static int findIndex(int arr[] , int s,int target){
        if(s>arr.length-1){
            return -1;
        }

        if(arr[s]!=target) {


           return findIndex(arr, s + 1, target);
        }
        return s;
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[] , int target,int s ){
        if(s==arr.length){
            return;
        }
        if(arr[s]==target){
            list.add(s);
        }
         findAllIndex(arr,target,s+1);

    }
    static ArrayList<Integer> findAllIndex2(int arr[], int target,int s , ArrayList<Integer>list){
        if(s== arr.length){
            return list;
        }
        if(arr[s]==target){
            list.add(s);

        }
        return findAllIndex2(arr,target,s+1,list);

    }
    static ArrayList<Integer> findAllIndex3(int arr[], int s, int target){
        ArrayList<Integer> list2 = new ArrayList<>();
        if(s==arr.length){
            return list2;

        }
        if(arr[s]==target){
            list2.add(s);
        }


       ArrayList<Integer> ans = findAllIndex3(arr,s+1,target);
        list2.addAll(ans);
        return list2;
    }
    static int RotatedBinarySearch(int arr[] , int target , int s , int e ){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if(target==arr[m]){
            return m;
        }
       if(arr[s]<=arr[m]){
           if(target>=arr[s]&&target<=arr[m]){
               return RotatedBinarySearch(arr,target,s,m-1);
           }
           else
               return RotatedBinarySearch(arr,target,m+1,e);

       }
        if(target<=arr[e]&&target>=arr[m]){
            return RotatedBinarySearch(arr,target,m+1,e);
        }
        return RotatedBinarySearch(arr,target,s,m-1);
    }
}
