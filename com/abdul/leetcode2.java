package com.abdul;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode2 {
    public static int [] twosum(int nums[] ,int target){
        int count= 0;
        int ans [] =new int [2];
        for (int i = 0; i < nums.length-1; i++) {
            count=target-nums[i];

                if(nums[i+1]==count){
                   ans[0]=i;
                   ans[1]=i+1;
                   break;




            }


        }
        return ans;
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int reverse=0;
        ArrayList<Integer> ans  = new ArrayList<>();
        ArrayList<Integer> ans2  = new ArrayList<>();
        int count =0;
        while(i!=j){
            ans.add(i);
            i++;

            }
            ans.add(j);




        for (int l = 0; l < ans.size(); l++) {
            int temp = ans.get(l);

            while(temp!=0) {


                int remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp = temp / 10;
            }

            ans2.add(reverse);
            reverse=0;
            if((ans.get(l)-ans2.get(l))%k==0){
                count++;
            }
        }



        return count;
    }
    public static void main(String[] args) {
  int arr [ ] ={3,2,3};
//        System.out.println(Arrays.toString(twosum(arr,6)));
        System.out.println(beautifulDays(1,2000000 ,23047885));
    }

}
