package leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [] [] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    rotate(arr);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");

            }

        }
    }
    public static void rotate(int[][] matrix) {

        int [] [] ans = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                int n = matrix.length-1;
                ans[i][j]= matrix[n-j][i];
            }

        }
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j < ans.length; j++) {
                matrix[i][j]=ans[i][j];

            }

        }


    }
}
