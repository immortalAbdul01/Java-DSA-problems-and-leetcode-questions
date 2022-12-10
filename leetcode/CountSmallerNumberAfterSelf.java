package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountSmallerNumberAfterSelf {


    //Brute force solution for the problem
    public static List<Integer> countSmaller(int[] nums) {
        int ans = 0;
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i])
                    ans++;
            }
            count.add(ans);
            ans = 0;
        }
        return count;
    }
// Optimized solution for the same problem

    public static List<Integer> countSmallerOP(int[] nums) {
        int ans = 0;
        int j = nums.length-1;
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
          while(j>i+1){

                if (nums[j] < nums[i]){
                    ans++;

                }
                j++;
            }
            count.add(ans);
            ans = 0;
            j= nums.length-1;
        }
        return count;
    }
    public static List<Integer> count(int nums[]) {
        Arrays.sort(nums);
        int ans = 0;

        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int  j= i+1;  j<nums.length ; j++) {
                if(nums[j]<nums[i]){
                    ans++;

                }
                else{
                    break;
                }

            }
            count.add(ans);
            ans = 0;


            }
        return count;

             }

    public static void main(String[] args) {
        int [] arr = { 5,2,6,1};
        System.out.println(count(arr));

    }

}
