package immortal_abdul;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ref35
{
    public static void main (String[] args) throws java.lang.Exception
    {
//        Scanner sc =new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i <=t; i++) {
//            double n =sc.nextInt();
//if(n<=25){
//    System.out.println(1);
//}
//else {
//
//    double sum = Math.ceil(n/25);
//    int ans =(int)sum;
//    System.out.println(ans);
//}
        System.out.println(catAndMouse(68, 84 ,76));
        }



    static String catAndMouse(int x, int y, int z) {
        if(x-z==z-y|| z-x==y-z){
            return "Mouse C";
        }
        if(y-x==z){
            return "Mouse C";

        }
        if(z-y>z-x){
            return "Cat A";
        }
         if(z-y<z-x){
            return "Cat B";
        }
         if (y-x==0){
            return "Mouse C";
        }

        else {
            return "Mouse C";
        }


    }
}
