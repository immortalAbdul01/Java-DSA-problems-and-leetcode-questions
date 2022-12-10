package com.abdul;

import java.util.Scanner;


public class ref5 {
    //question1 calculate the avg of three numbers
    public  static int avg(int x, int y , int z){
        return (x+y+z)/3;
    }
    //question 2 write a function to print the sum of all the odd number till n

    public static void odd(int n){
        for(int i =1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    //question 3 find the greater number from two numbers

    public static int greater(int n ,int m){
        if(n>m){
            return n;

        }
        else {
            return m;
        }
    }
// question 4 find the circumference of a circle
    public static void circumference(int r ){
        System.out.println(2*Math.PI*r);

    }
    // question 5 find the voter is eligible or not
public static String vote(int age ){
        if(age>18){
            return "yes you are eligilble for voting";
        }
        else if(age==18){
            return "We will think about you ";
        }
        else {
            return "Ooops you can't drive";
        }
}
//question 6 infinite loop using do while
    public static void infiniteLoop(){
        do{
            System.out.println("hello");
        }while (true);
    }
    // question 7 count the odd and even numbers entered by user
    public static  void oddAndEven(int n ){
        Scanner ab =new Scanner(System.in);
//        n=ab.nextInt();
        int odd=0;
        int even=0;
        for(int i =1;i<=n;i++){
            int number= ab.nextInt();
            if(number%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("SO the total odd numbers you have entered is :" +odd +"\n And the even numbers are : "+ even);


    }
    // question 8 find the power of two numbers
    public static int power(int n , int m ){
        return (int) Math.pow(n,m);

    }
    //question 9 find the greatest divisor of two numbers


    public static void commonDivisor(int n, int m ){
        for(int i =1;i<=n;i++){
            if(n%i==0){

                System.out.println(i);
            }
        }
        for(int i =1;i<=m;i++){
            if(m%i==0){

                System.out.println(i);
            }
        }

    }

    // question 10 print fibonacci series
//    public static void fibonacci(int n ){
//        for(int i =1 ; i<=n;i++){
//            System.out.println(n-i+n);
//        }
//    }


    public static void main(String[] args) {
        System.out.println("This file is created for functions questions ");
        Scanner ab =new Scanner(System.in);


        //question 1 answer
//        System.out.println( avg(ab.nextInt(),ab.nextInt(),ab.nextInt() ));
//        odd(60);
//        System.out.println(        greater(19,13));
//     circumference(5);
//        System.out.println(vote(19));
//        infiniteLoop();
//        System.out.println("how many numbers you want to add?");
//
//        oddAndEven(ab.nextInt());
//        System.out.println(        power(2,3));
//    commonDivisor(4,6);
//        fibonacci(7);
    }
}
