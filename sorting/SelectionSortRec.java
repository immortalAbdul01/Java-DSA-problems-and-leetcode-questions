package sorting;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int [] arr = {4,1,0,6,-14,0};
        System.out.println(Arrays.toString(selection(arr,arr.length-1,0)));
    }
    static int [] selection (int [] arr , int r ,int c ){
        if(r==0){
            return arr;
        }
        int max = max(arr,c,r);
        //swapping
        int temp = arr[max];
        arr[max]=arr[r];
        arr[r]=temp;
        return selection(arr,r-1,c);
    }

    private static int max(int[] arr, int c, int r) {
        int large = 0 ;
        int index= 0 ;
        for (int i = 0; i <=r ; i++) {
            if(large<arr[i]){
                large=arr[i];
                index=i;
            }

        }
        return index;
    }
}
