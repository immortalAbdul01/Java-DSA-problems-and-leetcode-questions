package immortal_abdul;

public class DSA18Nov {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(printSUm(1540));
        reverseANumber(3456);
        System.out.println(sum);
        System.out.println(countZero2(909090,0));
        System.out.println(numberOfSteps(10 ));

   }
    static void print1ton(int s , int n ){
        if(s==n){
            System.out.println(s);
            return ;
        }
        System.out.println(s);
        print1ton(s+1,n);

    }
    static void print1ton2(int n )
    {
        if(n==1){
            System.out.println(n);
            return;
        }
        print1ton2(n-1);
        System.out.println(n);
    }
static void printBoth(int n ){
        if(n==0){
            return;
        }
    System.out.print(n+" ");

        printBoth(n-1);
    System.out.print(n+" ");
}
static int factorial(int n){


    if(n<=1){
            return 1;
        }
       return n*factorial(n-1);

}
static int printSUm(int n ){
        if(n==1){
            return 1 ;
        }
        return n+printSUm(n-1);

}
static int sumOfDigits(int n ){
        // time complexity is log(n)
        if(n==0){
            return 0;
        }
        int rem=n%10;
        n/=10;
        return rem+sumOfDigits(n);
}
static int ProductOfDigits(int n ){
        if(n==1){
            return 1;

        }
        int rem = n%10;
        n/=10;
        return rem*ProductOfDigits(n);
}
static int sumOfDigits2(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits2(n/10);
}
// optimized way for product of number
    static int ProductOfDigits2(int n){
        if(n%10==n){
            return n;


        }
        return (n%10)*ProductOfDigits2(n/10);
    }
static int sum =0;
    static void reverseANumber(int n){

        if(n==0){
            return ;

        }
        int rem=n%10;

        sum=sum*10+rem;
        reverseANumber(n/10);



    }
    static int rev = 0;
    static boolean palindrome(int n ){
        if(n==0){
            return true;
        }

        int rem = n%10;
        rev=rev*10+rem;
        palindrome(n/10);

        return n==rev;
    }
    static int count=0;

    static int CountZero(int n ){

        if(n==0){
            return 0;
        }
        int rem =n%10;
        if(rem==0){
            count++;
        }
        CountZero(n/10);

        return count;
    }
    // special pattern
    static int countZero2(int n , int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return countZero2(n/10,c+1);
        }
        else
        return countZero2(n/10,c);



    }
    // best example to learn recurrsion
    static int numberOfSteps(int n ){
        return helper( n , 0);
    }
    static int helper(int n, int c){
        if(n==0){
            return c;
        }
        if(n%2==0) {

            return helper(n / 2, c + 1);
        }
        return helper(n-1,c+1);
    }
}
