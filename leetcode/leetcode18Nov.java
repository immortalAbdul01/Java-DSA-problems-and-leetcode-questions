package leetcode;

import java.util.ArrayList;

public class leetcode18Nov {
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =1; i <1000 ; i++) {
            for (int j = 0; j < arr.length; j++) {


                if (i  == arr[j])
                    i++;




            }
                list.add(i);
        }

        System.out.println(list+" "+list.size());

        return list.get(k-1);


    }
    public static int  findKthMissingPositive2(int arr[] , int k ){
        for (int i = 0; i < arr.length; i++) {
            if(i<=k){
                k++;
            }
            else {
                break;
            }

        }
        return k-1;
    }
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]*2&&i!=j){
                    return true;
                }

            }

        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={
                2,3,4,7,11
        };
        System.out.println(findKthMissingPositive2(arr,5));
    }
}
