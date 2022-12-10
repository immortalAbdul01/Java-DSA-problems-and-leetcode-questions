package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LeetcodeRandom {
    public static int NumberOfGoodPairs(int nums[]){

            int ans = 0;
            int[] temp = new int[101];

            for (int i = 0; i < nums.length; i++) {
                ans += temp[nums[i]]++;
            }
            return ans;
    }
    public static int[] plusOne(int[] digits) {
        int count= 0;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]==9){
                count++;

            }


        }
        if(count==digits.length){
            int ans[]=new int[digits.length+1];
            ans[0]=1;
            return ans;
        }
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
        }
        else {
            for (int i = digits.length-2; i>=0 ; ) {
                if(digits[i]<9){
                    digits[i]=digits[i]+1;
                    digits[i+1]=0;
                    break;

                }
                else
                    digits[i+1]=0;
                    i--;

            }
        }
        return digits;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int last = image.length - 1;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length/2; j++) {

               int temp= image[i][j] ;

               image[i][j]=image[i][last];
               image[i][last]=temp;
                last--;


            }
            last=image.length-1;
        }
            for (int i = 0; i < image.length; i++) {
                for (int j = 0; j < image.length; j++) {


                    if(image[i][j]==0){
                        image[i][j]=1;
                    }
                    else image[i][j]=0;
                }


        }
        return image;
    }
        public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }
    public static  int typeColor(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0 ;
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey=="type"&& items.get(i).get(0)==ruleValue){
                count++;
            }
            else if(ruleKey=="color"&& items.get(i).get(1)==ruleValue){
                count++;
            }
            else if(ruleKey=="name"&& items.get(i).get(2)==ruleValue){
                count++;
            }




        }
        return count;
    }
    public static int[] smallerNUmber2(int nums[]){
        int ans [] = new int [nums.length];
        int count= 0 ;
        for(int i = 0 ; i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;

                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;

    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int early = 0;

        for (int i = 0; i <a.size(); i++) {
            if(a.get(i)<=0){
                early++;
            }




        }
        if(k!=early){
            return "YES";
        }
        return "NO";


    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans =new int [nums1.length+nums2.length-1];
        double medain= 0;

        for (int i = 0; i <Math.min(nums1.length,nums2.length) ; i++) {
          if(nums1[i]>nums2[i]){
              ans[i]=nums2[i];
              ans[i+1]=nums1[i];
          }
          else  ans[i]=nums1[i];
            ans[i+1]=nums2[i];

        }
        if(ans.length%2!=0){
            medain= (double)ans.length/2;
        }
        else {
            int mid = ans[ans.length/2]+ans[(ans.length/2)+1];
            medain= (double)mid;

        }
        System.out.println(Arrays.toString(ans));
        return medain;

    }
    public static void main(String[] args) {
        int arr[]= {1,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int guess(int n){
        Random rc = new Random();
        int b = rc.nextInt(1,10);
        if(n>b){
            return -1;

        }
        if(n<b){
            return 1;
        }
        else {
            return 0;

        }
    }
    static int guessNum(int n ){
        if(n==1){
            return 1;
        }
        int s = 0;
//        int a = 0;
        int e = n;
        while(s<=e){
            int m= s+(e-s)/2;
            if(guess(m)==-1){
                e=m-1;

            }
            else if(guess(m)==1){
                s=m+1;
            }
            else {

                return m;

            }
        }
        return -1;
    }

    static int  searchInser(int[] nums, int target){
        int s = 0 ;


        int e = nums.length-1;
        while(s<=e) {
            int m = s + (e - s) / 2;


            if (target < nums[m]) {
                e = m - 1;

            } else if (target > nums[m]) {
                s = m + 1;

            } else {

                return m;
            }
        }
        return s;


    }

}
