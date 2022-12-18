package sorting;

import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int [] arr ={5,2,1,6,81,1};
        System.out.println(Arrays.toString(bubbleSort(arr,arr.length-1,0)));
    }
    static int [] bubbleSort(int [] arr , int r, int c ){
        if(r==0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                // swaping
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;

            }
            return bubbleSort(arr,r,c+1);


        }
        else {
           return bubbleSort(arr,r-1,0);

        }
    }

}
