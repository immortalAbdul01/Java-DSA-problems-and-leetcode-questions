package leetcode;

import sorting.MergeSort;



public class MedianOfTwoArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []ans= merge2(nums1,  nums2);
        int n = ans.length;
        int  mid =  n/2;
        if(ans.length%2==0){
            return ((double)(ans[mid]+(double)ans[mid-1])/2);
        }
        return (double)  ans[mid];
    }
    public static int [] merge2(int [] nums1 ,int [] nums2){
        int i =  0;
        int j = 0 ;
        int [] ans = new int [nums1.length+nums2.length];
        int k = 0;
        while(i<nums1.length&&j< nums2.length){
            if(nums1[i]>=nums2[j]){
                ans[k]=nums2[j];
                j++;
            }
          else  if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
            }
          k++;
        }
        if(i<nums1.length){
            while(i<nums1.length){
                ans[k]=nums1[i];
                i++;
                k++;
            }
        } if(j<nums2.length){
            while(j<nums2.length){
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr1 = {3};
        int [] arr2 = {-2,-1};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }

}
