package com.abdul;

import javax.management.StandardEmitterMBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {1,2,2,4};

        System.out.println(Arrays.toString(findMismatch(arr)));
    }
    static void accendingSort(int arr [ ] ){
        boolean swapped =false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                swapped=false;
                if(arr[j]<arr[j-1])
                    // swaping
                {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }

static void cyclicSort(int arr [ ]) // array must be in  1 to n form
{
    int i = 0 ;
while (i<arr.length){

        int correct = arr[i];


            if (arr[i] != arr[correct]) {
                swap(i, correct, arr);
            } else i++;


    }

}
static int  cyclicSort2(int arr [ ])
{
int i = 0 ;

while (i< arr.length){
    int correct = arr[i];

    if(arr[i]< arr.length&&arr[i]!=arr[correct]){
       int temp =i ;
        i = correct;
        correct=temp;
    }

    else i++;

}
    for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j){
            return j;
        }

    }
    return arr.length;

}

static void insertionSort(int arr [ ]){
    for (int i = 0; i < arr.length-1; i++) // arr.length-1 is taken bcauz at the end when i will be at last index and j will be j+1 then
        // it will throw index out of bond error thats why be cautious   and must be continuos no numbers should be missing {
        for (int j = i+1; j>0 ; j--) {
            if(arr[j]<arr[j-1]){
                swap(j,j-1,arr );

            }
            else break;

        }
    }
static void insertionSortDes(int arr [ ]){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j>0 ; j--) {
            if(arr[j]>arr[j-1]){
                swap(j,j-1,arr );

            }
            else break;

        }
    }
}

static void insertionSort2(int arr[]){
    for (int i = 0; i <arr.length-2 ; i++) {
        for (int j = i+1; j >0; j--) {
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp;
            }
            else break;

        }

    }
}
    static void desendingSort(int arr [ ] ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]>arr[j-1])
                    // swaping
                {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }

        }
    }

    static void selectionSort(int arr [])
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max= maxIndex(arr,0,last);
            swap(max,last,arr);

        }

    } static void desendingSelectionSort(int arr [])
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;          // last will be updated bcz it is already sorted
            int max= maxIndex(arr,0,last);
            swap(max,last,arr);

        }

    }
    static void bubbleSOrt(int arr []){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
    }

    static void swap(int first , int second ,int arr[])
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int maxIndex(int arr[],int start , int end){
        int max= 0;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }  static int minIndex(int arr[],int start , int end){
        int max= 0;
        for (int i = start; i <=end ; i++) {
            if(arr[max]>arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void cyclicSort22(int arr [ ]){
        int i= 0;
        while (i < arr.length) {
            int correct = arr[i];
            if(arr[i]!=arr[correct]){
             swap(i,correct,arr);

            }
            else i ++;
        }
    }
    static int  duplicateNumber(int arr []){


        int i = 0 ;
        while(i< arr.length){

            int correct = arr[i]-1;
            if(arr[i]< arr.length&&arr[i]!=arr[correct]){
              int temp = arr[i] ;
             arr[i] =arr [correct];
               arr[correct]=temp;
            }
            else i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return arr[index];
            }

        }
    return arr[arr.length-1];
    }
    static List<Integer>  missingNumber(int arr []){
 ArrayList<Integer> list = new ArrayList<>();

        int i = 0 ;
        while(i< arr.length){

            int correct = arr[i]-1;
            if(arr[i]< arr.length&&arr[i]!=arr[correct]){
              int temp = arr[i] ;
             arr[i] =arr [correct];
               arr[correct]=temp;
            }
            else i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                list.add(index+1);

            }

        }
    return list;
    }
static int[] findMismatch(int arr[])
{


    int i =0;
    while (i< arr.length){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }
        else i++;
    }
    int ans[]=new int[2];
    for (int index = 0; index < arr.length; index++) {
        if(arr[index]!=index+1){

            ans[0]=arr[index];
            ans[1]=index+1;
        }


    }
    return ans;
}
static int findPositive(int arr[])
{
    int i = 0 ;
     while (i<arr.length){
         int correct = arr[i]-1;
         if(arr[i]>0&&arr[i]!=arr[correct]){
             int temp = arr[i];
             arr[i]=arr[correct];
             arr[correct]=temp;
         }
         else i++;
     }
    for (int index = 0; index < arr.length; index++) {
        if(arr[index]!=index+1){
            return index+1;
        }
    }
    return arr.length+1;
}


}
