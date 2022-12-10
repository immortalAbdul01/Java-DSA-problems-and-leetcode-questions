package com.abdul;

import java.util.Scanner;

public class ref24 {
    public static void grading(int arr[]){
        int arr2[]=new int[arr.length];
for(int i =0 ;i< arr.length;i++){
   for(int j =1 ;j<5;j++){
          if(arr[i]%5==0){
           arr2[i]=arr[i];
       }
       int cal=arr[i]+j;
       if(cal%5==0){
           int divisor=cal;
           if(arr[i]<38){
               arr2[i]=arr[i];
           }
           else if(divisor-arr[i]<3){

                   arr2[i]=divisor;







           }

           else {
               arr2[i]=arr[i];
           }
       }
   }


}
        for(int i =0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
       for (int i=0;i< arr.length;i++){
           arr[i]=sc.nextInt();
       }
grading(arr);

    }
}
