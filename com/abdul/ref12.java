package com.abdul;

public class ref12 {
    public static void prinNU(int n ){
        if(n==10){
            return;
        }
        System.out.println(n);

        prinNU(n+1);
    }

    //Getting The Sum of first n natural numbers
    public static void SumOfFirstNaturalNumbers(int i , int n , int sum){
        if(n==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        SumOfFirstNaturalNumbers(i+1,n,sum);

    }

    // Factorial using recursive method
    public static int factorial(int n  ){
        if(n==1||n==0){
            return 1;

        }

        int factNm1=factorial(n-1);
        int nMf=n*factNm1;
        return nMf;
    }
    // RECURSIVE METHOD
            //print the fibonacci series upto nth term
    public static void fibonacci(int a,int b,int n   ){
        if(n==0){
            return;
        }
        int c =a+b; // creating a new varible to add previous numbers
        System.out.println(c);
        fibonacci(b,c,n-1);
    }


    // calculate x^n

    public static int xN(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 1;
        }
        int nm12 =xN(x,n-1);
        int newm= x*nm12;
        return newm;

    }

    // calculating x to the power of n with stack hight should be log(n)

    public static int calcxpn(int x , int n){
        if (n==0){
            return 1;
        }if (x==0){
            return 1;
        }
        if(n%2==0){
            return calcxpn(x,n/2)*calcxpn(x,n/2);
        }
        else {
            return calcxpn(x,n/2)*calcxpn(x,n/2)*x;
        }

    }


    // Practice for recursin question
 // question 1 practice
//    print the numbers from 5 to 1

    public static void printNUmbers(int n ){
        // returning from the function beacuse the value of n become 0
        if(n==0){
            return;
        }
        // printing n
        System.out.println(n);
        // updating the value of n by n-1 for ex. if n =5 then the value will be
        // updated as n-1(5-1)=4 after update it will print again the value of n
        printNUmbers(n-1);
    }


    // question 2
    // print the numbers from 1 to 5

    public static void printReverse(int n,int i  ){
        if(n==i){
            System.out.println(n); // printing the value of n after the condtion satisfying before returing
            return;
        }
        System.out.println(n);//printing the value of n here
        printReverse(n+1,i);// updating the value of n here
    }
// question 3
    // print the sum of first n natural numbers

    public static void sumOfFirstNaturalNumbers(int n, int sum ){
        if(n==0){
    // before retunring from this function we are printing the sum
            System.out.println("the sum is  : "+sum);
            return;
        }
//        System.out.println(sum);
        sum+=n;// adding n into sum varible after updatation
        sumOfFirstNaturalNumbers(n-1,sum);// so here we are going from n to 0

        //      return sum;

    }

    // question 4
    // print a factorial of given number

    public static void facctorail (int n ,int sum){
        if(n==0){
            System.out.println(sum);
            return ;
        }
        sum*=n;
        facctorail(n-1,sum);

    }
// question 5
    // print the fibonacci series upto nth term
    public static void fibbb(int a , int b , int n ){
        if(n==0){
            return;
        }
//        System.out.println(0);
//        System.out.println(1);

        int c = a+b;
        System.out.println(c);
        fibbb(b,c,n-1);


    }
// question 6
    // get the x^n
    public static int powerOF(int x,int n){
        if(n==0){
            return 1;
        } if(x==0){
            return 0;
        }
        int xM=powerOF(x,n-1);
        int ne=xM*x;
        return ne;

    }
    //get the x^n with the stack height log(n)

    public static int powerOfWithLog(int x ,int n ){
        if(n==0){
            return 1;

        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return powerOfWithLog(x,n/2)*powerOfWithLog(x,n/2);

        }
        else {
            return powerOfWithLog(x,n/2)*powerOfWithLog(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println("yes this is working you can start coding");
//        prinNU(6);
        // print the sum of first  n natural numbers
        //ITERATIVE METHOD
int sum=0;
        for (int i =0 ;i<=20;i++){
    sum+=i;

        }

//        System.out.println(sum);
        //RECURSIVE METHOD
//        SumOfFirstNaturalNumbers(0,20,0);



        // print the factorial of n number
        //ITERATIVE METHOD
            int fact=1;
        for(int i =1;i<=5;i++){
            fact=fact*i;
        }
//        System.out.println(fact);
//        System.out.println(factorial(9));
//
//
//
//
//        // fibonacci series upto nth term in iterative method
//        int first =0 ;
//        int second =1 ;
//        for(int i =1;i<=7;i++){
//            int third = first;
//            first=second;
//            second=third+first;
//            System.out.println(third);
//        }
//        System.out.println(0);
//        System.out.println(1);
//        int n = 7;
////        fibonacci(0,1,n-2);
//        System.out.println(xN(2,5));
//        System.out.println(calcxpn(2,5));
        printNUmbers(5);
        printReverse(1,5);
        sumOfFirstNaturalNumbers(10,0);
        facctorail(7,1);
        System.out.println(0);
        System.out.println(1);
        fibbb(0,1,7-2);
        System.out.println(        powerOF(2,5)
        );System.out.println(        powerOfWithLog(2,2)
        );
    }


}
