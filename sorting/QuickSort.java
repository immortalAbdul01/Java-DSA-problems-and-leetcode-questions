package sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={77,34,89,65,106,11,208,225,224,76,43,345,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortRec(int arr[],int s , int e ){
        if(s>=e){
            return;
        }
       int l = s ; // here using a reference variable for swapping purpose and the variables passed in the arguement will be used
        // as to consider the range of an array

        int h = e ;
        int m = l+(h-l)/2;
        int pivot=arr[m];
        while(l<=h){
            while(arr[l]<pivot){
                l++;

            }
            while (arr[h]>pivot){
                h--;
            }
            if(l<=h){
                //swaping
                int temp= arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
                l++;
                h--;
            }

        }
        // here comes recurrsion calls
        quickSortRec(arr,s,h);
        quickSortRec(arr,l,e);
    }
    static void quickSortR2(int arr[] , int l , int h)
    {
        if(l>=h){
            return;
        }
        int s = l ;
         int e =h;
         int m = s+(e-s)/2;
         int pivot =arr[m];
         while(s<=e){
             while(arr[s]<pivot){
                 s++;
             }
             while (arr[e]>pivot){
                 e--;
             }
             if(s<=e){
                 // swap
                 int temp = arr[s];
                 arr[s]=arr[e];
                 arr[e]=temp;
                 s++;
                 e--;
             }
         }
         quickSortR2(arr,s,h);
         quickSortR2(arr,l,e);
    }
    static void quickSort(int [] arr , int s , int e ){
        int l  = s ;
        int h = e ;
        // why to take extra variables?
        // ans : bcauz the variables in argument will go in recurrsion call and then we
        // will struggle to swap the integers
        int m = s+(e-s)/2;
        int pivot=arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                // simple if it is smaller then move ahead
                s++;
            }
            while (arr[e]>pivot){
                // if it is greater move back
                e--;
            }

            if(s<=e){
                // swapping
                int temp =  arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quickSortR2(arr,s,h);
        quickSortR2(arr,l,e);
    }
}

