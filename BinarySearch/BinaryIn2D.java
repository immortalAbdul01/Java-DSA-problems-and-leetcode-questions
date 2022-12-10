package BinarySearch;

import java.util.Arrays;

public class BinaryIn2D {
    public static void main(String[] args) {
        int arr[][]= {
                {10,20,30,40},
                {41,42,43,44},
                {45,46,47,48},
                {49,50,52,56},
        };
        System.out.println(Arrays.toString(sortedMatrix(arr,42)));
        System.out.println(arr.length);

    }
    static int [] search(int arr[][], int target){
        int row=0;
        int col = arr.length-1;
        while(row<arr.length &&col>=0){
            if(target==arr[row][col]){
                return new int [ ] {row,col};
            }
            if(arr[row][col]<target){
                row++;

            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
    static int [] sortedMatrix(int arr[][ ] , int target){
        int row= 0 ;
         int col = arr.length-1;
         while (row<arr.length&&col>=0){
             if(arr[row][col]==target){
                 return new int[] {row,col};
             }
             if(arr[row][col] <target){
               row++;
             }
             else{
                 col--;
             }
         }
         return new int [] {-1,-1};
    }
}
