package com.abdul;

public class Leetcode16Nov {
    public static int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }

        int i = 1;
        int ans =0 ;
        while(n>0){
            n-=i;
            i++;
            if(n>=0) {


                ans++;
            }


        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }
}
