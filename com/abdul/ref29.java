package com.abdul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ref29 {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int Lscore = 0 ;
        int highElem= 0 ;
        int lowElem= 0 ;
        int Hscore=0;
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = scores.get(0);

        if(temp<=scores.get(1)) {
            highElem=scores.get(1);
        }
         if(temp>=scores.get(1)) {
            lowElem=scores.get(1);
        }

         if (temp>scores.get(1)){
            highElem=temp;
        }  if (temp<scores.get(1)){
            lowElem=temp;
        }

        int end = scores.get(scores.size()-1);


        System.out.println(lowElem);
              for(int j=1 ;j<scores.size()-1;j++){
                  if(highElem<scores.get(j+1)){

                      highElem=scores.get(j+1);
                      Hscore++;
                  }
                 else if(highElem==end){
                      Hscore++;
                  }

              }
              for(int j=1 ;j<scores.size()-1;j++){
                  if(lowElem>scores.get(j+1)){

                    lowElem=scores.get(j+1);
                      Lscore++;

                  }


                  else if(lowElem==end){
                      Lscore++;
                  }


              }






        arr.add(Hscore);

        arr.add(Lscore);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("yes this is working ");
     ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
     for(int i = 0 ; i<n;i++){
         arr.add(sc.nextInt());
     }

        System.out.println( breakingRecords(arr));

    }
}
