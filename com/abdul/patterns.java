package com.abdul;

public class patterns {
    public static void main(String[] args) {
        System.out.println("hello");
       pattern9(4);
    }
    static void pattern1(int n )
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("X ");

            }
            System.out.println();

        }
    }
    static void pattern2(int n ){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("X ");

            }
            System.out.println();

        }
    }
    static void pattern3(int n ){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print("X ");

            }
            System.out.println();

        }
    }
    static void pattern4(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
    static void pattern5(int n ){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("X ");
            }
            System.out.println();



        }
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n-i ; j++) {
                System.out.print("X ");

            }
            System.out.println();

        }
    }
    static void pattern6(int n ){
        // less time and space used in this approch
        for (int i = 0; i <= 2*n; i++) {
            int col= i;
            for (int j = 0; j <=col; j++) {


                    System.out.print("X ");
                if(col>=n){
                    col=n*2-i;

                }




            }
            System.out.println();

        }
    }
    static void pattern7(int n ){
        for (int i = 0; i <= 2*n; i++) {
            int col= i;
            if(col>=n){
                col=n*2-i;

            }
            int spaces= n-col;
            for (int j = 0; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=col; j++) {


                System.out.print("X ");





            }
            System.out.println();

        }

    }
    static void pattern8(int n ){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
    static void pattern9(int n ){
        // this is the best pattern question I have ever solved .
        int temp=n;
        n= 2*n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                int atIndex=temp-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atIndex);
            }
            System.out.println();

        }
    }


}
