package com.abdul;

import java.util.Scanner;

public class ref6 {
    public static void main(String[] args) {
        System.out.println("this file is about arrays is java ");
//        int []marks=new int[5];
//        for (int i =1;i<marks.length;i++){
//            marks[i]=i;
//            System.out.println(marks[i]);
//        }

//        String names[]={"abdul","Rahul","rohit","sachin "};
//
//
//
//        for(int i =0;i<names.length;i++){
//            System.out.println(names[i]);
//        }

//
        Scanner sc = new Scanner(System.in);

        // question 1
        /*
        Take input from user as students names and print them
         */
//        System.out.println("Enter the number of studetns : ");
//int size= sc.nextInt();
//        String names[]=new String[size];
//        System.out.println("Enter names of students then we will wish them ");
//
//        for(int i =0 ; i< names.length;i++){
//            names[i]= sc.next();
//        }
//for(int i =0 ; i< names.length;i++){
//            System.out.println("Hello "+names[i]+" Good evening ");
//
//        }


// question 2 find the array is in assending order or descending order


    int[]marks={11,2,14,19};
    boolean isAsending=true;

    for(int i=0;i< marks.length-1;i++){
        if(marks[i]>marks[i+1]){
        isAsending=false;

        }

    }
    if(isAsending){
        System.out.println("Yes this array is in assending order ");
    }
    else {
        System.out.println("No this array is in desending order ");

    }





//int size= sc.nextInt();
// int abdulMarks[]=new int[size];
//
// for(int i =0;i<size;i++){
//
//    abdulMarks[i]= sc.nextInt();
// }
//
// for(int i =0 ;i<size;i++){
//     System.out.println(abdulMarks[i]);
//
// }




    }
}
