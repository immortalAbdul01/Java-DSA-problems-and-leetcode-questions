package Recurrsion;

public class Level1 {
    public static void main(String[] args) {
//        print1To5(7);
//        System.out.println(sumOfDigitsRec(1234));
//        System.out.println(factorialIter(5));
//        print(3);
        String name = "rsr";
        System.out.println(palinRec(name,0,name.length()-1 ));
        countZero(3001);
//        System.out.println(sum2);
        System.out.println(countSteps(4));
    }
    static void print1To5(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        print1To5(n-1);
        System.out.println(n);

    }
    static int factorial(int n ){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int factorialIter(int n ){
        int fac =1 ;
        for (int i = 1; i <=n ; i++) {
            fac*=i;


        }
        return fac;
    }
    static int sumOfDigitsIter(int n ){
        int sum = 0 ;
        while(n!=0) {


            int rem = n % 10;
            n /= 10;

            sum += rem;
        }
        return sum;

    }
static boolean palin(int x){

    String sid = Integer.toString(x);
    int s = 0;
    int e = sid.length()-1;
        while(s<e) {
            if (sid.charAt(s) ==sid.charAt( e)) {
                s++;
                e--;
            } else {
                return false;
            }

        }
    return true;
}
    static int sumOfDigitsRec(int n ){
        if(n==1){
            return 1;

        }
        return (n%10)+sumOfDigitsRec(n/10);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(--n);
    }
static int sum =0 ;
    static void reverse(int n){
        if(n==0){
            return ;
        }
        int rem = n%10 ;

        sum=sum*10+rem;
        reverse(n/10);

    }
    static boolean palinRec(String name ,int start , int end ){
        if(start==end){
            return true ;
        }
        if(name.charAt(start)==name.charAt(end)){
            return palinRec(name,start+1,end-1);

        }
        return false;
    }
    static int sum2 =0;
    static void countZero(int n ){
        if(n==0){
            return ;
        }
        int rem = n%10;
        if(rem==0){
            sum2++;
        }
         countZero(n/10);
    }
    // taking count inside the argument
    static int countZeroar(int n,int count){
        if(n==0){
            return count;
        }
        int rem= n%10;
        if(rem==0){
            return countZeroar(n/10,count+1);
        }
        return countZeroar(n/10,count);
    }
    static int count(int n ){
        return countZeroar(n,0);
    }
    static int countSteps(int n ){
        return helper( n ,0);
    }

    private static int helper(int n, int i) {
        if(n==0){
            return i;
        }
        if(n%2==0){
           return helper(n/2,i+1);
        }
        return helper(n-1,i+1);
    }
}
