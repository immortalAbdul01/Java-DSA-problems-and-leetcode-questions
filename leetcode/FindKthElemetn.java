package leetcode;

import java.util.Arrays;

public class FindKthElemetn {

    public static int getMax(int start , int end , int [] arr ) {
        int max =0 ;
        for (int i = start; i <end ; i++) {
            if(arr[i]>max){
                max=i;
            }


        }
        return max;
    }

    public static void main(String[] args) {

    }

}
