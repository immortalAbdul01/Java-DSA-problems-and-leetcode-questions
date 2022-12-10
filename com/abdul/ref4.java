package com.abdul;

public class ref4 {
    //creating a function which prints your name and age
    public  static void printMyNane(int n ,String s){
        System.out.println("the name of student is : "+ s+" \nand the age is :"+n);
    }


    // function for generating factorial
    public static  int genrateFactoria(int n){
        int factrorial=1;
        for(int i=n;i>=1;i--){
            factrorial=factrorial*i;

        }
        System.out.println(factrorial);
        return factrorial;
    }
public static void checkPrime(int n ){
        for(int i=2 ;i<n;i++){
            if(n%i==0){
                System.out.println("no it is not a prime number");

            }
            else {
                System.out.println("yes it is a prime number ");
            }
        }



}
    public static void checkEven(int m ){
        if(m%2==0){
            System.out.println("yes it is a even number");
        }
        else {
            System.out.println("No it is not");
        }
    }
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }

    }
    public static void main(String[] args) {

//        System.out.println("Yes this is working you can start coding");
//        printMyNane(34,"priya");
//        genrateFactoria(5);
//        checkPrime(8);
//        checkEven(11);
        table(14);
    }
}
