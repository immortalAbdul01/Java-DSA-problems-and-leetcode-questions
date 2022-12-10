package Recurrsion;

public class Introduction {
    // lets say you have to print a message for 5 times
    public static void main(String[] args) {
//        printNo(14);
        int ans = fibo(4);
        System.out.println(ans);

    int [] arr ={1,2,6,9,10,11,13,16};
        System.out.println(BinarysearchUsingRecurssion(arr,0,arr.length-1,11));
    }


    // printing numbers using recurrsion
    static  void printNo(int n ){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        printNo(n-1);

    }
    //fibonacci number
    static int fibo(int n  ){
        if(n<2){
            return n ;
        }
        return fibo(n-1)+fibo(n-2);
    }


    static int BinarysearchUsingRecurssion(int [] arr , int s , int e,int target ){
        if(s>e){
            return -1;
        }

        int mid = s+(e-s)/2;
        if(target>arr[mid]){
           return BinarysearchUsingRecurssion(arr,mid+1,e,target);


        }
        else if (target<arr[mid]){
            return BinarysearchUsingRecurssion(arr,s,mid-1,target);
        }

            return mid;

    }


}

