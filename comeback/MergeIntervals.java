package comeback;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {



        int n = intervals.length;
        boolean [] merged  = new boolean[n];
        List<int []> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(merged[i]) continue;
            int start = intervals[i][0];
            int end = intervals[i][1];

            for (int j = 0; j < n; j++) {
                if(i==j || merged[j]) continue;
                int s = intervals[j][0];
                int e = intervals[j][1];

                if(end>=s && e>=start){
                    start = Math.min(start,s);
                    end = Math.max(end,e);
                    merged[j]=true;

                }

            }
            ans.add(new int[]{start,end});







        }
        return ans.toArray(new int [ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{2,3}, {4,5}, {6,7}, {8,9}, {1,10}};

        System.out.println();
    }
}
