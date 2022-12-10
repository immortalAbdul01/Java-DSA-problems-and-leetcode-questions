package com.abdul;

import java.util.Arrays;
import java.util.Locale;

public class ref40 {
    public static void main(String[] args) {
        System.out.println("hello this file is working good");
////        System.out.println(palindrome("Tbt"));
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <=26; i++) {
//            char ch = (char) ('a'+i);
//            sb.append(ch+"   ");
//        }
//        System.out.println(sb.toString().toUpperCase());

        String name = "Abdul Khan";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(Arrays.toString(name.split(" ")));

    }
    static boolean palindrome (String str){

        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start  =str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }

        }
        return true;
    }static boolean palindrome (int num){
       String str=Integer.toString(num);
       str= str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start  =str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }

        }
        return true;
    }

    }