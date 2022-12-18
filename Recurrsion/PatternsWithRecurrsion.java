package Recurrsion;

public class PatternsWithRecurrsion {
    public static void main(String[] args) {
        pattern1(5,0);
        pattern2(0,0,5);
        pattern3(5,0);
    }
    static void pattern1(int r,int c){
      if(r==0){
          return;
      }

      if(c<r){
          System.out.print("X");
          pattern1(r,c+1);
      }
      else{
          System.out.println();
          pattern1(r-1,0);
      }
    }
    static void pattern2(int r , int c , int n ){
        if(r==n){
            return;
        }
        if(c<r){
            System.out.print("X");
            pattern2(r,c+1,n);

        }
        else{
            System.out.println();
            pattern2(r+1,0,n);
        }
    }
    static void pattern3(int r , int c ){
        if(r==0){
            return;
        }
        if(c<r){
            pattern3(r,c+1);
            System.out.print("X");



        }
        else {
            pattern3(r-1,0);
            System.out.println();

        }
    }
}

