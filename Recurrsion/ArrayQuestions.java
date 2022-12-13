package Recurrsion;

import java.util.ArrayList;

public class ArrayQuestions {
    public static void main(String[] args) {
        int [] arr = {5,2,3,4,5,5,56,7,5};
        ArrayList<Integer> list = new ArrayList<>();
    }

    // checking the array is sorted or not
    static boolean checkWhetherSorted(int [] arr, int s ){
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]<arr[s+1]){
            return checkWhetherSorted(arr,s+1);
        }
        return false;


    }
    // Linear search in array
    static int search(int [] arr , int s,int target ){
    if(s== arr.length){
        return -1;
    }
        if(target==arr[s]){
            return s ;
        }
        else return search(arr,s+1,target);
    }

    // returning all the occurences of element
    static ArrayList<Integer> list = new ArrayList<>();
    static void  returningALlIndex(int [] arr ,int target , int s ){
        if(s==arr.length){
            return;
        }
        if(arr[s]==target){
            list.add(s);
        }
        returningALlIndex(arr,target,s+1);
    }
//    return the arraylist and search elements in an array on  multiple occurence


}
