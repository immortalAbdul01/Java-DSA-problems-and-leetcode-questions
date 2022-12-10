package immortal_abdul;

import java.util.Arrays;

public class DSA20Nov {
    public static void main(String[] args) {
//        pattern1R(5,0);
//        pattern2R(0,0,5);
//        pattern2AR(5,0);
        int arr[]={4,5,2,8,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void pattern1R(int r,int c){

        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("X");
            pattern1R(r,c+1);
        }
        else {
            System.out.println();
            pattern1R(r - 1, 0);
        }

    }
    static void pattern2AR(int r , int c){
        if(r==0){
            return;
        }
        if(c<r){
            pattern2AR(r,c+1);
            System.out.print("X");
        }
        else {
            pattern2AR(r-1,0);
            System.out.println();
        }
    }
    static void pattern2R(int r , int c,int n){
        if(r==n){
            return;
        }
        if(c<=r){
            System.out.print("X");
            pattern2R(r,c+1,n);
        }
        else {
            System.out.println();
            pattern2R(r+1,0,n);
        }
    }

static void pattern1I(int n ){
    for (int i = 0; i <n ; i++) {
        for (int j = 0; j < n-i; j++) {
            System.out.print("X");

        }
        System.out.println();

    }

}
static void pattern2I(int n ){
    for (int i = 0; i <n ; i++) {
        for (int j = 0; j <i ; j++) {
            System.out.print("X");

        }
        System.out.println();

    }
}
static void bubbleSortR(int  r, int c , int arr[]){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp= arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSortR(r,c+1,arr);
        }
        else {
            bubbleSortR(r-1,0,arr);
        }
}
static void selectionSortR(int n , int s , int arr[]){
        if(n==0){
            return;
        }
        if(s<n){
           int ans= max(arr,n);
            // swaping
            int temp = arr[ans];
            arr[ans]=arr[n];
            arr[n]=temp;
            selectionSortR(n-1,0,arr);
        }

}
static int max(int arr[],int n){
        int max1 = 0;
        int ans= 0;
    for (int i = 0; i <n ; i++) {
        if(ans<arr[i]){
            ans=arr[i];
            max1=i;


        }

    }
    return max1;

}
static void selectionSortR2(int arr[] , int n , int s , int max ){
        if(n==0){
            return;
        }
        if(s<n){
            if(arr[s]>arr[max]){
                selectionSortR2(arr,n,s+1,s);

            }
            else {
                selectionSortR2(arr,n,s+1,max);
            }

        }
        else {
            int temp = arr[max];
            arr[max]= arr[n];
            arr[n]=temp;
            selectionSortR2(arr,n-1,0,0);
        }
}
static void bubbleSort(int arr [ ] , int n,int s ){
        if(n==0){
            return;
        }
        if(s<n){
            if(arr[s]>arr[s+1]){
                // swapping
                int temp = arr[s];
                arr[s] =arr[s+1];
                arr[s+1]=temp;

            }
            bubbleSort(arr,n,s+1);
        }
        else {
            bubbleSort(arr,n-1,0);
        }
}

}
