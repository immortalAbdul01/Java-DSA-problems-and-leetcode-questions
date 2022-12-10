package com.abdul;

import java.util.function.LongUnaryOperator;

public class ref28 {
    public static boolean isHappy(int n ){
        int slow=n;
        int fast=n;

        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));

        }
        while ((fast!=slow));
        if (slow==1){
            return true;
        }
        return false;

    }
    private static int findSquare(int num){
        int ans=0;
        while (num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println("HEllo ");
        System.out.println("hello again");

//        l3.insertFirst(3);


        System.out.println(    isHappy(19));
        LinkList lq=new LinkList();
        lq.insertFirst(4);
        lq.insertFirst(2);
        lq.insertFirst(3);
        lq.insertFirst(4);
        lq.insertFirst(4);
        lq.display();
        lq.reverse();
        lq.display();

    }
}
