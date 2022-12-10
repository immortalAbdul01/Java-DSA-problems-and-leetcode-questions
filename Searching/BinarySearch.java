package Searching;

public class BinarySearch {
    public static int BinarySearch1(int[] arr ,int target ){
        int start = 0 ;
        int end = arr.length-1;
        // taking a while loop till end is greater than start
        while(start<=end){
            int middle = (start+end)/2; // calculating the middle as per formula
            // checking all the three conditions
            if(arr[middle]==target){
                // it is simple if the middle element is equal to target then simple return the middle
                return middle;
            }
            else if(arr[middle]>target){
                // end will become mid -1 because we only have to check left hand side of an array
                end = middle-1;
            }
            else {
                // start will become mid +1 because we only have to check right hand side of an array

                start =middle+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={1,4,6,8,9,11};
        System.out.println(BinarySearch1(arr,9));

    }
}
