package leetcode;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        if (arr[mid - 1] > arr[mid]) {
            while (arr[mid - 1] > arr[mid]) {
                mid--;
            }
        }
        if (arr[mid + 1] > arr[mid]) {
            while (arr[mid + 1] > arr[mid]) {
                mid++;
            }
        }
        return mid;

    }
    // more faster solution
    static int peakIndexInMountainArray2(int arr[]){
        int s = 0 ;
        int e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                s=mid+1;
            }
            else {
                e =mid ;
            }
        }
        return s ;
    }
}
