package immortal_abdul;

import java.util.Scanner;

public class ref34 {
    public static void main(String[] args) {


        System.out.println(drawingBook(2,1));
        drawingBook2(7,5);

    }
    static int drawingBook(int n , int p ){
        int count=0;
        if(n%2!=0){




        if(p==n-1){
            return 0;

        }

        }
        if(n%2==0) {
            if(p==1){
            return 0;
            }

            if(p==n-1&&p!=1){
                return 1;
            }

        }


        if(p<(n/2)||p==(n/2)){
            for (int i = 1; i < p; i++) {
                if(i%2!=0){
                    count++;
                }
            }
        }
        else {

                for (int i = n-1; i >=p ; i--) {
                    if(n%2==0){
                    if (i % 2 == 0) {
                        count++;
                    }
                }
                    else {
                        if(i%2!=0){
                            count++;
                        }
                    }
                }



        }
        return count;
    }
    static void drawingBook2(int n , int p) {int mid = (n + 1) / 2;

        if(p < mid) {
        System.out.println(p / 2);
    } else {
        System.out.println((n - p) / 2);
    }}
    static  int moneyCount(int[] keyboards, int[] drives, int b){
        int max=0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i]+keyboards[j];
                if(sum<=b){
                    max=sum;
                }
            }}
        return max;

    }

}
