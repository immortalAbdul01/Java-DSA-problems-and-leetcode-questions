package com.abdul;

import java.util.Scanner;

public class ref9 {
    public static void main(String[] args) {
        System.out.println("Yes this is working you can start coding");
        // declaration of string
        String name="Abdul";
        //concantation
        String sirName="Abdul";
        String con=name+sirName;
//        System.out.println(name+" "+sirName);
        //charAt

//        for(int i =0 ; i<con.length();i++){
//
//                System.out.println(con.charAt(i));
//
//
//        }
        //compares to
//        System.out.println(name.compareTo(sirName));
        // substring method
//        System.out.println(name.substring(2));

        //converting string into integer using parseInt method
        String str="352351";

        int n =Integer.parseInt(str);
//        System.out.println(n);

        Scanner sc = new Scanner(System.in);

        //converting integer to string using tostring method
        int no=224141242;
        String s = Integer.toString(no);
//        System.out.println(s);
//
//        String arr []=new String[3];
//        for (int i =0 ;i<arr.length;i++){
////            arr[i]=sc.next();
//
//
//        }
//        int combinedLength=0;
//        for (int i =0 ;i<arr.length;i++){
//            System.out.println(arr[i]);
//            combinedLength+= arr[i].length();
//
//        }
////        System.out.println(combinedLength);
//

//        String inp =sc.next();
//        String result="";
//        for(int i = 0 ; i<inp.length();i++){
//            if(inp.charAt(i)=='e'){
//                result+='i';
//            }
//            else {
//                result+=inp.charAt(i);
//            }
//
//        }
//        System.out.println(result);

        String email = sc.next();
        for(int i =0 ;i<email.length();i++){
            if(email.charAt(i)=='@'){
                System.out.println("The username is : "+email.substring(0,i));
            }
        }
    }
}
