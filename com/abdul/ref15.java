package com.abdul;

import java.util.ArrayList;

public class ref15 {
    // Q1 print all the permutation of a string
   /*
   ex abc acb bca bac cab cba

    */
    public static void permutationOfString(String str , String perm){
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length();i++){
        char currenCH=str.charAt(i); // first we are getting characters of a string with the help of for loop
         String newStr=str.substring(0,i)+str.substring(i+1); // then we are adding here substring of main string into new string
                                                             // so we are taking the next charcter
         permutationOfString(newStr,perm+currenCH); // updating the current string with the new string and  adding currencharacter at
//            in perm
        }

    }
    // Q2 . CountPathMaze
//    Count total paths in a maze to move from (0,0) to (n-1,m-1)
//    // given n=3,m=3
//    // condition you can only move right and downwords
//
    public  static  int countPath(int j , int i ,int n ,int m ){
        if(j==m-1&&i==n-1){
            return 1;

        }
        if (i == n || m == j) {
            return 0;
        }

        // for moving downwords
        int down =countPath(j , i+1,n,m);
        int right =countPath(j +1, i,n,m);
        return down+right;

    }
    // Q3 place tiles of 1*M into the floor of having the size of n*M
    public static  int Tiles(int n , int m ){
        if (n == m) {
            return 2;
        }
        if (n < m) {

            return 1;
        }
        int verticle= Tiles(n-m,m);
        int horizontal= Tiles(n-1,m);
        return verticle+horizontal;
    }

    //Q4 find the numbber of ways in which you can invite n people to your party , single or in pair
    public static int Party(int n  ){
        if (n <= 1) {

            return 1;
        }
        int single = Party(n-1);
        int pair = Party(n-1)*Party(n-2);
        return single+pair;
    }
    //print all the subsets of  first n natural numbers
    public static void subsetOFinteger(int n , ArrayList<Integer>sub){
        if (n == 0) {

            for(int i = 0 ; i<sub.size();i++){
                System.out.print(sub.get(i));
            }
            System.out.println();
            return;
        }
//        to add an element in array
        sub.add(n);
        subsetOFinteger(n-1,sub);
//        to remove the element beacause we are subsetting here
        sub.remove(sub.remove(sub.size()-1));
        subsetOFinteger(n-1,sub);

    }
    // sum of first n natural numbers using recurrsion
    public static int sumOfFirst(int n ){
        if(n==0){
            return 0;
        }
return n+sumOfFirst(n-1);

    }
    // print numbers from 5 to 1
    public static void printFrom5to1(int n ){
        if (n == 0) {

            return;
        }
        System.out.println(n);
        printFrom5to1(n-1);
    }

    //print numbers from 1 to n
    public static void printFrom1to5(int idx,int n ){
        if(idx>n){
            return;
        }
        System.out.println(idx);
        printFrom1to5(idx+1,n);

    }
// print sum of first n natural numbers
    public static void naturalNo(int n ,int sum){
        if (n == 0) {
            System.out.println(sum);
            return;

        }
        sum+=n;
        naturalNo(n-1,sum);




    }
    // one more method for printing the sum of first natural numbers
    public static int naturaNos(int n ){
        if (n==0) {
            return 0;

        }
        return n +naturaNos(n-1);

    }
    // print the factorial of a number
    public static void fact(int n ,int fac){
        if (n == 0) {
            System.out.println(fac);
           return ;
        }
       fac*=n;
        fact(n-1,fac);


    }
    // print the fibonaaci series till nth term
    public static void fib(int a,int b ,int n ){
        if(n==0){
            return;
        }
        System.out.println(a);
        fib(b,a+b,n-1); // here we are updating the value and replacing a with b and updating n
    }

    // get the power of x^n with stack height logn

    public static int powerOf(int x , int n )
    {
        if (n == 0) {

            return 1;
        }
        if (n % 2 == 0) {

            return powerOf(x,n/2) * powerOf(x,n/2);
        }
        else {
            return x*powerOf(x,n/2)*powerOf(x,n/2);

        }
    }
    // tower of hanoi problem
    public static void TowerOfHanoi(String src, String Helper, String des,int n ){
        if (n == 1) {
            System.out.println("The disk "+n+" is transferred to "+src+" To "+des);

            return;
        }
        TowerOfHanoi(src,des,Helper,n-1);
        System.out.println("The disk "+n+" is transferred to "+src+" To "+des);
        TowerOfHanoi(Helper,src,des,n-1);



    }

    public static void main(String[] args) {
        System.out.println("yes this is for practice of all recursion problems based ");
        // lets start with advanced recursion problems
        // Q1 print all the permutation of a string
//        permutationOfString("adc","");
//        System.out.println(Tiles(5,2));
//        System.out.println("The no of ways to call these guests "+Party(3));
//        ArrayList<Integer> sub = new ArrayList<>();
//        subsetOFinteger(4,sub);
//        System.out.println(   sumOfFirst(10));
//        printFrom5to1(5);
        printFrom1to5(1,5);
        naturalNo(10,0);
        System.out.println(naturaNos(20));
        fact(7,1);

        fib(0,1,7);
        System.out.println(powerOf(2,2));
        System.out.println(powerOf(3,5));
        TowerOfHanoi("S","H","D",3);
    }

}
