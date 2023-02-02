package Searching;

public class BS {
    public static void main(String[] args) {
        int [] arr ={4,6,8,11,34,67};
        System.out.println(BinarySearch(arr,11));
    }
    static int BinarySearch(int [] arr,int target ){
        // the first thing
        int start = 0 ;
        int end = arr.length-1;

        // approch
        /*
          S         M    T         E
        [(4),6,11,(23),(46),89,(878)]
         0 1 2  3   4    5  6
         mid = length/2 = 3
         T>M
         s = m+1
         */

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }
}
