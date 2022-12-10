package immortal_abdul;

import java.util.Scanner;

public class ref1
{
    public static void main(String[] args) {
        System.out.println("this is first refresher object");
                //for loop
//                for(int i =1;i<5;i++){
//            System.out.println("This is refresher of java");
//        }

        // while loop
//        int i =1 ;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
        //do while loop
//int i =21;
//        do{
//            System.out.println("this is refresher ");
//            i++;
//        }while (i<15);



        // question 1
//        print the sum of first 10 natural number

//        int n =10;
//        int sum=0;
//        for(int i =1;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);


        //question 2
//        print the multipication table of given number
//    int n =6;
//    for (int i =1; i<=10;i++){
//        System.out.println(i*n);
//    }


        //question 3
//        print all even number till n

        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt() ;
//        for(int i =1;i<=n;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }

        boolean isprime=true;
        int n = sc.nextInt();
        for (int i =2; i<n;i++){
            if(n%i==0){
isprime=false;
break;
            }


        }
   if(isprime){
       System.out.println("yes it was a prime number ");
   }
   else {
       System.out.println("No it was no");

   }
    }




}
