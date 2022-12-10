package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        MergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MergeSortR(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int []left = MergeSortR(Arrays.copyOfRange(arr,0,mid)); ;
        int Right [] = MergeSortR(Arrays.copyOfRange(arr,mid,arr.length)) ;
        return  merge(left,Right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i =0 ;
        int j= 0;
        int k =0 ;
        int ans []= new int [left.length+ right.length];
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
        // so there is might possiblity that some numbers are remaining in the array
        while(i< left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;

    }
    static int[] MergeSortR2(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left=MergeSortR2(Arrays.copyOfRange(arr,0,mid));
        int [] right=MergeSortR2(Arrays.copyOfRange(arr,mid,arr.length));
        return merge2(left,right);

    }

    private static int[] merge2(int[] left, int[] right) {
        int i=0 ;
        int k=0 ;
        int j=0 ;
        int []ans=new int[left.length+ right.length];
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
        // so there might be a possiblity of some elements are remaining in any one of them
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        } while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
static void MergeSortInplace (int [] arr , int s , int e ){
        if(e-s==1){
            return;
        }
        int m = (s+e)/2;
        MergeSortInplace(arr,s,m);
        MergeSortInplace(arr,m,e);

        merge4(arr,s,m,e);


}

    private static void merge4(int[] arr, int s, int m, int e) {
        int i = s ;
        int j = m;
        int k =0 ;
        int ans [] = new int[e-s];
        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;

            }
            else {
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
       while (i<m){
           ans[k]=arr[i];
           i++;
           k++;
       }
       while(j<e){
           ans[k]=arr[j];
           j++;

           k++;
       }
        for (int l = 0; l < ans.length; l++) {
            arr[s+l]=ans[l];

        }
    }
}
