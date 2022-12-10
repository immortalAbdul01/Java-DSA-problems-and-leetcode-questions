package leetcode;

import java.util.Arrays;

public class RankTransform {
    public static void main(String[] args) {
int [] arr = {100,100,100};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {

        int []sort= Arrays.copyOf(arr,arr.length);
        Arrays.sort(sort);
        int [] ans = new int [ arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(sort[i]==arr[j]){
                    if(i<2) {

                        ans[j] = i+1;
                    }
                    else ans[j] = i;

                }




            }


        }
        return ans;


    }
}
