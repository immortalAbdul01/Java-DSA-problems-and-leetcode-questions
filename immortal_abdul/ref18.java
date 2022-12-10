package immortal_abdul;

public class ref18 {
 public static void getMinMax(int A[]){
     int num=A[0];

     for(int i = 1 ;i< A.length;i++){
         if(A[i]>num){
            num=A[i];
         }

     }
     System.out.print("max value is "+num+" ");

for(int i = 1 ; i<A.length;i++){
    if(A[i]<num){
        num=A[i];
    }
}
     System.out.println("Min value is "+num);
 }

    public static void main(String[] args) {
     int arr[]={2,3,557,9,2,68};

getMinMax(arr);
    }
}
