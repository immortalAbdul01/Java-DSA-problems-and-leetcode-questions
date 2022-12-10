package com.abdul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ref31 {
    public static int birthday(List<Integer> s, int d, int m) {
int count = 0 ;
for(int i = 0 ; i<s.size();i++){
    int sum=0;
    if((i+m)>s.size()){
        return count;
    }

    for (int j = 0; j <m ; j++) {
        sum+=s.get(i+j);

    }


    if(sum==d){
         count++;
    }
}
return count;
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
       int count=0;

        for (int i = 0; i <ar.size()-1 ; i++) {
            for (int j = i+1; j <ar.size() ; j++) {
                if((ar.get(i)+ar.get(j))%k==0){
                    count++;
                }
            }

            }
        return count;


}
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
int one=0 ;
int two=0 ;
int third=0 ;
int fort=0 ;
int five=0 ;


            for (int j = 0; j <arr.size(); j++) {
                if(1==arr.get(j)){
                    one++;

                }if(2==arr.get(j)){
                    two++;

                }if(3==arr.get(j)){
                    third++;

                }if(4==arr.get(j)){
                    fort++;

                }if(5==arr.get(j)){
                    five++;

                }

            }
            ArrayList<Integer> list = new ArrayList<>()
;
            list.add(one);
            list.add(two);
            list.add(third);
            list.add(fort);
            list.add(five);
            int max = 0;
            int index=0;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)>max){
                max=list.get(i);
                index=i;
            }

        }
        return index+1;

    }
    public static int newBirds(List<Integer> l){
        int id=0;

            int max=0;
            for (int j = 1; j <6; j++) {
                if(l.get(j)>max){
                    max=l.get(j);
                    id=j;
                }

            }


        return id;
    }
    public static String dayOfProgrammer(int year) {
        String str1 ="";

        // Write your code here
        if (year < 1918 && year % 4 == 0) {
           str1+="12.09."+year;
        }
       else  {
//            return "13.09." + year;
            str1 += "13.09."+year;
        }
        return str1;
    }


    public static void main(String[] args) {
        System.out.println("hello this is for practice of hackerrank");
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(3);
        System.out.println(dayOfProgrammer(2100));
//        System.out.println(2100%4);
        Scanner ab = new Scanner(System.in);

            int a = ab.nextInt();
            int b = ab.nextInt();
            if(a<b) {
                System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
    }
}
