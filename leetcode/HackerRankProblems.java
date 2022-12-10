package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRankProblems {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        Collections.sort(a);
      int subarray= 1 ;
       int max=0;
       int elem= a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if(Math.abs(elem-a.get(i))<=1){
           // incrementing the subarray only if the elem is less than or equal to 1
                subarray++;
                max= Math.max(subarray,max);
            }


            else{
                subarray=1;
                elem=a.get(i);

            }



        }
        return max;
        }


    public static void main(String[] args) {
ArrayList<Integer> a = new ArrayList<>();
a.add(4);
a.add(6);
a.add(5);
a.add(3);
a.add(3);
a.add(1);
        System.out.println(pickingNumbers(a));
    }

}
