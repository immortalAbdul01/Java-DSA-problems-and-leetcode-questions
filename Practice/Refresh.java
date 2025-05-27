package Practice;

import java.util.Arrays;

public class Refresh {
    static int  findTheElementfromArray(int target, int [] arr ){

        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }

        }
        return -1;


    }
    static void oddNumbers(int n){

        for (int i = 0; i <=n; i++) {
            if(i%2!=0){
                System.out.println(i);
            }

        }
    }
    static int BinarySearch(int target,int [] arr ){

        int start =0 ;
        int end = arr.length;


        while(start<end){
            int mid = (start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
        }
        return -1;


    }
    static void BubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }


        }
        return true;
    }
    static void listOfPrimeNumbers(int n ){
        for (int i = 0; i <=n; i++) {
            if(isPrime(i)){
                System.out.println(i);

            }
        }
    }

    static void star(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
    static int sumofdigits(int n){
        int sum =0 ;
        while(n>0){
            sum+= n%10;
            n/=10;
        }

        return sum;
    }
    static boolean isPalindrome( int n ){
        int reverse= n;
        int temp =0;
        while(n!=0){
            int digit = n%10;
            temp=temp*10+digit;
            n/=10;

        }
        return temp == reverse;
    }
    static int reverse(int n ){
        int temp = 0 ;
        while(n!=0){
            int digit= n%10;
            temp=temp*10+digit;
            n/=10;
        }
        return temp;
    }
    public static void main(String[] args) {
//        System.out.println("hello world ");
//
//        System.out.println("I am trying to brush up my ds askills");
//
//        int [] arr = {1,24,5,6,19,2,12,78,14,7};
//
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////
////        }
////        System.out.println(findTheElementfromArray(24,arr));
////        oddNumbers(20);
//        System.out.println(BinarySearch(5,arr));
//BubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(isPrime(12));
        listOfPrimeNumbers(10);
        star(5);
        System.out.println(sumofdigits(190));
        System.out.println(isPalindrome(121));
        System.out.println(reverse(45634));
    }
    
}
