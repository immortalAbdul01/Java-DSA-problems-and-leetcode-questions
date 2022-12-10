package com.abdul;
// creating an function for printing an array


public class ref11 {
    public static void  printArr(int arr[] ){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={6,11,5,8,19};

        // this file is for sorting
        // Bubble sorting


//for(int i =0 ;i<numbers.length-1;i++){
//    for(int j =0 ; j<numbers.length-i-1;j++){
//        if(numbers[j]>numbers[j+1]){
//            //swap
//            int temp =numbers[j];
//            numbers[j]=numbers[j+1];
//            numbers[j+1]=temp;
//        }
//    }
//}


        // Above method is used for bubble sorting




        // SELECTION SORT

//        for(int i = 0 ;i<numbers.length-1;i++){
//            int small=i;
//            for(int j= i+1 ; j<numbers.length;j++){
//                if(numbers[small]>numbers[j]){
//                    small=j;
//                }
//
//            }
//            int tem=numbers[small];
//            numbers[small]=numbers[i];
//            numbers[i]=tem;
//        }


// Selection sort practice
//        for(int i =0 ;i<numbers.length;i++){
//            int small=i;
//            for(int j =i+1;j< numbers.length;j++){
//                if (numbers[small]>numbers[j]){
//                     small=j;
//
//                }
//
//            }
//            int temp = numbers[small];// saving the smallest number currently in temp variable
//
//            numbers[small]=numbers[i];// swaping the smallest number at the first index
//            numbers[i]=temp;//then swaping the first index element at smallest numbers previous place
//
//        }


// BUBBLE SORT PRACTICE
//        for(int i = 0 ;i<numbers.length-1;i++){
//            for(int j = 0 ; j< numbers.length-i-1;j++){
//                if(numbers[j]>numbers[j+1]){ // checking if the number at j is bigger than the next element
//                    //swap
//                    int temp = numbers[j]; // storing the element at j in temp variable
//                    numbers[j]=numbers[j+1];//swaping the greatest element at the last position of an array
//                    numbers[j+1]=temp;// swapping the element present at j+1 with the previous position of greatest number
//                }
//            }
//        }


        //INSERTION SORT
        for(int i =0 ; i< numbers.length;i++){
            int current = numbers[i];
            int j = i-1;
            while(j>=0&& current<numbers[j]){
                numbers[j+1]=numbers[j];
                j--;
            }
numbers[j+1]=current;
        }





printArr(numbers);
    }



}
