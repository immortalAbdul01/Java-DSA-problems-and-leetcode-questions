package com.abdul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ref8 {
    public static void main(String[] args) {
        System.out.println("Yes this is working you can start coding");
        Scanner sc = new Scanner(System.in);
//        int [][]  marks=new int[2][4];
//        for(int i=0;i<2;i++){
//            for(int j =0 ;j<4;j++){
//                marks[i][j]= sc.nextInt();
//            }
//
//
//        }
//        for(int i =0 ; i<2;i++){
//            for(int j=0; j<4;j++){
//                System.out.print(marks[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//
//        int [][]search=new int[3][4];
//        for(int i =0 ;i<3;i++){
//            for(int j =0; j<4;j++){
//                search[i][j]= sc.nextInt();
//            }
//        }
//        for(int i = 0 ; i<3;i++){
//            for (int j =0 ;j<4;j++){
////                System.out.println(search[i][j]+' ');
//
//                if(search[i][j]==4){
//                    System.out.println("The location is "+"("+i+","+j+")");
//                }
//            }
////            System.out.println();
//
//        }
//        int [][]Names=new  int[2][3];
//
//        for(int i =0 ;i<2;i++){
//            for (int j=0;j<3;j++){
//                Names[i][j]= sc.nextInt();
//            }
//        }
//        for (int i =0 ; i<2;i++){
//
//
//                System.out.println(Arrays.toString(Names[i]));
//            }
//        ArrayList<ArrayList<Integer>>mulLIst=new ArrayList<>();
//        for(int i = 0 ;i<3;i++){
//            mulLIst.add(new ArrayList<>());
//
//        }
//        mulLIst.get(1).add(5657);
//        mulLIst.get(2).add(56);
//        mulLIst.get(0).add(657);
//        mulLIst.get(0).add(65);
//        mulLIst.get(0).add(7);
//        mulLIst.get(0).add(657);
//        for(int i = 0 ;i<3;i++){
//            for(int j = 0 ;j<3;j++){
//                mulLIst.get(i).add(sc.nextInt());
//
//            }
//        }
//        System.out.println(mulLIst);
        int arr []= {1,22,3,4,5,6,7};
//        swap(arr,0,2);
        reverse(arr);
        // STOPSHIP: 29-09-2
        System.out.println(Arrays.toString(arr));


        }
        static void swap(int arr [],int index1,int index2){
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        }
        static void reverse(int arr[]){
        int start =0 ;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        }
  static int max(int arr []){
        int max =arr[0];
      for(int i = 1 ;i< arr.length;i++){
          if(max<arr[i]){
              max=arr[i];
          }
      }
      return max;

        }

////
//

}
