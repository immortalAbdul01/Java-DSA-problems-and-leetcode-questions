package Recurrsion;

import java.util.ArrayList;

public class ArrayQuestion2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 5, 5, 56, 7, 5};
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(returnAllIndex3(arr, 0, 5));
        System.out.println(list1);
    }

    static ArrayList<Integer> returningALlIndex2(int[] arr, ArrayList<Integer> list, int target, int s) {
        if (s == arr.length) {
            return list;
        }
        if (arr[s] == target)
            list.add(s);
        return returningALlIndex2(arr, list, target, s + 1);

    }
    // return the list without passing in argument

    static ArrayList<Integer> returnAllIndex3(int [] arr , int s , int target){
        ArrayList<Integer>list = new ArrayList<>();
        if(s==arr.length){
            return list;
        }
        if(arr[s]==target){
            list.add(s);
        }

        ArrayList<Integer> ansFromBelowCalls= returnAllIndex3(arr,s+1,target);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}

