package com.abdul;

import java.util.ArrayList;

public class DSA16Nov {

    public static void main(String[] args) {
        factors3(36);
    }
    static  void factors (int n ){
        // normal and brute force solution
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }

        }
    }
    static void factors2(int n ){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i+" ");
            }

        }
    }
    static void factors3(int n){
        ArrayList<Integer> lsit = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){

                    System.out.print(i+" ");


                if(n/i!=i){


                lsit.add(n/i);
                }


            }


        }
        for (int i = lsit.size()-1; i >=0 ; i--) {
            System.out.print(lsit.get(i)+" ");

        }
    }
}
