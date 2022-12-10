package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int [] arr1 ={4,9,5};
        int [ ] arr2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
   static int[] intersection(int[] nums1, int[] nums2) {
     int top = 0;
     int bottom = 0;
     ArrayList<Integer> list = new ArrayList<>();
     Arrays.sort(nums1);
     Arrays.sort(nums2);
     while(true){
         if(top>=nums1.length){
             break;
         }
         if(bottom>=nums2.length){
             break;
         }
         if(nums1[top]==nums2[bottom]){
             list.add(nums1[top]);
             top++;
             bottom++;
         }
         else if(nums1[top]<nums2[bottom]){
             top++;
         }
         else {
             bottom++;
         }
     }
       int [] arr = new int[list.size()];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = list.get(i);

       }
       return arr;

   }
}
