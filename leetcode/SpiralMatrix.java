package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [] [] arr= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
          list.add(matrix[0][i]);


        }
        for (int i = 1; i < matrix.length; i++) {
            list.add(matrix[i][matrix[i].length-1]);

        }
        for (int i = matrix.length-1;i >=0 ; i--) {
            list.add(matrix[matrix.length-1][i]);

        }
        for (int i = 0; i < matrix.length-1; i++) {
            list.add(matrix[matrix.length-2][i]);

        }
        return list;
    }
}
