package immortal_abdul;

import java.util.Queue;

public class ref17 {
    public static int partition(int arr[],int low , int high){
      int pivot=arr[high];
      int i = low -1 ;
      for (int j = low; j<high;j++)
      {
          if(arr[j]<pivot){
              i++;

              int temp = arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
      }
      i++;
      int temp =arr[i];
      arr[i]=arr[high];
      arr[high]=temp;
      return i;
    }

    public static void quickSort(int arr[],int low , int high){
    if(low<high){
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }

    }
  public static   int partition2(int A[], int l , int h ){
        int pivot=A[l];
        int i = l +1;
        int j = h;
        for( i= i; i<j;i++) {

            while (A[i] <= pivot) {
                i++;

            }
            while (A[j] > pivot) {

                j--;
            }
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        // swap A[j] with A[l]
        int temp =A[j];
        A[j]=A[l];
        A[l]=temp;
        return j;
    }
public static  void QuickSort(int A[], int l , int h ){
        if(l<h){
            int partitionidx= partition2( A, l , h );
            quickSort(A,l,partitionidx-1);
            quickSort(A,partitionidx+1,h);
        }
}

public static  int  partition3(int low , int high , int A[])
{

    int pivot =A[low];
    int i = low+1;
    int j = high;


    for(int t = i ; t<j;t++){

    while(A[i]<=pivot){
        i++;
    }
    while (A[j]>pivot){
        j--;
    }
    // swaping the i and j
        if(i<j){
    int temp = A[i];
    A[i]=A[j];
    A[j]=temp;
    }}

// now swapping the A[low ] with j
    int temp = A[low];
    A[low]=A[j];
    A[j]=temp;
    return j;
}

public static void quickSort_2(int low , int high , int A[]){
        if(low<high){
            int partiIndex=partition3(low , high, A);
            quickSort_2(low,partiIndex-1,A);
            quickSort_2(partiIndex+1,high,A);
        }
}
public static int partition5(int low , int high , int arr[]){
        int pi= arr[low];
        int i = low+1;
        int j = high;
        for(int t = i ; i>j;i++){
            while (arr[i]>pi){
                i++;
            }
            while (arr[j]<pi){
                j--;
            }
            if(i>j){
                //swap i with j
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // swap j with arr[low]

    int temp = arr[low];
        arr[low]=arr[i];
        arr[i]=temp;
        return j;
}
public static int partition4(int l, int h , int arr[]){
        int pivot = arr[l];
//        int j = h;
    int i = l+1;
    int j = h ;
    for(int t =i;t<j;t++) {

        for (i = l + 1; arr[i] <= pivot; i++) {
            for (j = h; j > pivot; j--) {
                // swap
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
        // now swaping arr[l] with arr[j]

    int temp= arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return i;

}


public static void quickSort_3(int   l , int h , int arr[]){
        if(l<h){
            int pi = partition5(l, h,arr);
            quickSort_3(pi+1,h,arr);

            quickSort_3(l,pi-1,arr);
        }
}
public static int partitionR(int l , int h , int arr[]){
        int pivot=arr[h];
        int i = l-1;
for (int j = h ; j>=l;j--){
    if(arr[j]>pivot){
        i++;
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }

}
// swaping arr[h] with arr[i+1]
    int temp=arr[i+1];
arr[i+1]=arr[h];
arr[h]=temp;
return i+1;
}


public static void reverseQuickSort(int l , int h , int arr[]){
        if(l<h){
            int partionidx=partitionR(l,h,arr);
            reverseQuickSort(l,partionidx-1,arr);
            reverseQuickSort(partionidx+1,h,arr);
        }
}

public static void bubbleSort(int arr[],int idx){
        if(idx==arr.length-1){
            return;

        }
    bubbleSort(arr,idx+1);

    if(arr[idx]>arr[idx+1]) {
            int temp = arr[idx];
            arr[idx] = arr[idx + 1];
            arr[idx + 1] = temp;
        }
        bubbleSort(arr,idx+1);

}
    public static void main(String[] args) {
        System.out.println("yes this file is working ");
        int arr[]={2,45,7,99,0,8,78};
        int n= arr.length;
//        quickSort(arr,0,n-1);
        for(int t = 0 ; t<n;t++){
            System.out.print(arr[t]+" ");

        }
        System.out.println();

//reverseQuickSort(0,n-1,arr);
      bubbleSort(arr,0);
        for(int t = 0 ; t<n;t++){
            System.out.print(arr[t]+" ");

        }
        System.out.println();




    }
}
