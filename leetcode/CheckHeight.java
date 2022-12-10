package leetcode;

import java.util.Arrays;

public class CheckHeight {
    public static void main(String[] args) {
int [ ] arr = {1,2,3,4,5};
        System.out.println(heightChecker2(arr));
    }
    static int heightChecker(int[] heights) {
        int [] arr = Arrays.copyOf(heights,heights.length);

        Arrays.sort(arr);
        int count =0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=heights[i]){
                count++;
            }

        }
        return count;

    }
    //Bubble sort
    static int heightChecker2(int [] heights){
        int start =0 ;
        int count = 0 ;
        int end  = heights.length-1;
        while (start<=end){
            if(heights[start]>heights[end]){
                count++;
                end--;
            }
            else {
                start++;
            }
        }
        if(count==heights.length-1){
            count++;
        }
        return count;
    }
}
