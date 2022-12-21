package Recurrsion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int [] arr ={8,6,2,18,14,0,3};
        System.out.println(Arrays.toString(merge(arr)));
    }
    static int [] merge(int[] arr ){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = merge(Arrays.copyOfRange(arr,0,mid)) ;
        int [] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
         return sort(left,right);

    }

    private static int[] sort(int[] left, int[] right) {
        int i = 0 ;
        int j =0 ;
        int k =0 ;
        int [] ans = new int[right.length+left.length];
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;

            }
            else {
                ans[k]=right[j];
                j++;
            }
            k++;
        }

        // what if there are some elements remaning
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }  while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }

}
