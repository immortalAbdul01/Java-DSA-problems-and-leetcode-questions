package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
    int [] arr ={1,2,3,0,0,0};
    int [] arr2 ={2,5,6};
    merge(arr,arr.length,arr2,arr2.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 ;
        int j = 0;
        int k =0 ;
    int [] ans =new int [nums1.length];
        while(i<m/2&&j<n){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
            }
            else{
                ans[k]=nums2[j];
                j++;
            }
            k++;

        }
        while(i<m/2){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        for(int x =0 ;x<ans.length;x++){
            nums1[x]=ans[x];
        }
    }
}
