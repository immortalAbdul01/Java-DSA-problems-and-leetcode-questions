package Recurrsion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {7,5,3,1,2,4,6};
        System.out.println(rotatedBinary(arr,0,arr.length-1, 2));
    }
    static int rotatedBinary(int [] arr , int s , int e  , int target ){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m ;
        }
        if(arr[s]<=arr[m]){
            if(arr[s]<=target&&target<=arr[m]){
                return rotatedBinary(arr,s,m-1,target);
            }
            else {
                return rotatedBinary(arr,m+1,e,target);
            }
        }
        if(arr[m]<=target&&target<=arr[e]){
            return rotatedBinary(arr,m+1,e,target);

        }

            return rotatedBinary(arr,s,m-1,target);

    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }

}
