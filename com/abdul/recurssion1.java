package com.abdul;

public class recurssion1 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(fibo(i));

        }
        fibo2(10);

    }

    static void printN(int start,int n){
        if (n == start) {
            System.out.println(n);
            return;
        }
        System.out.println(start);
        printN(start+1,n);

    }
static int fibo(int n ){
        if(n<2){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
}
static void fibo2(int n ){

        int first =0;
        int second=1;

    System.out.println(0);
    System.out.println(1);
    for (int i = 0; i <n ; i++) {


        int third=first;
        first=second;
        second=third+first;

        System.out.println(second);


    }


}
static int Binarysearch(int s , int e , int target , int arr[]){
        if(s>e){
            return -1;

        }
        int mid = s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return Binarysearch(s,mid-1,target,arr);
        }
        return Binarysearch(mid+1,e,target,arr);





}

}
