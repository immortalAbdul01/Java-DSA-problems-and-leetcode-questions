package leetcode;

public class SpecialArray {
    public static  int specialArray(int[] nums) {
     int s = 0 ;
     int e = nums.length;
     while(s<=e) {
         int count = 0;
         int mid = s + (e - s) / 2;
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] >= mid) {
                 count++;
             }}
             if (count == mid) {
                 return mid;
             } if(count>mid) {
                 s = mid + 1;
             }
             else {
                 e =mid-1;
             }


     }
        return -1;

    }
    public static void main(String[] args) {
int [] arr = {0,4,3,4,0};
        System.out.println(specialArray(arr));
    }

}
