package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
int [] [] arr= {{1,3},{2,6},{8,10},{15,18}};


        System.out.println(Arrays.toString(merge(arr)));
    }
    public static int[][] merge(int[][] intervals) {
     List<List<Integer>> list = new ArrayList<>();
     List<Integer> helper= new ArrayList<>();
         for (int i = 0; i < intervals.length-1; i++) {
             for (int j = 0; j < intervals[i].length-1; j++) {


                 if (intervals[i][j+ 1] >= intervals[i + 1][j]) {
                     helper.add(intervals[i][j]);
                     helper.add(intervals[i + 1][j+ 1]);
                     list.add(helper);
                 }
             }

        }
         int [][]ans =new int[list.size()][];
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size(); j++) {
                ans[i][j]=list.get(i).get(j);

            }

        }
        return ans ;

    }
}
