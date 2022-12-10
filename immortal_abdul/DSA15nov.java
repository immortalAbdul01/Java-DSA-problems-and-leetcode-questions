package immortal_abdul;

public class DSA15nov {
    public static void main(String[] args) {
//for (int i = 2; i < 20; i++) {
//if(i%2!=0||i==2) {
//
//
//    if (isPrime(i)) {
//        System.out.println(i);
//    }
//}
//        }
        boolean primes[]= new boolean[40];
        seveOfEranthesosi(39,primes);
        System.out.println();
        System.out.println(SqurtBinarySearch(40,11));
    }
    static boolean isPrime(int  n) {
        // best solution to print all the prime numbers
        // most efficeint code for prime number
        if(n==1){
            return false;
        }
        int c= 2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    static void seveOfEranthesosi(int n , boolean[] primes)
    {
        // this is the best approch for printing all prime numbers
        for (int i = 2; i*i <=n ; i++) {
            for (int j = i*2; j <=n ; j=j+i) {
                primes[j]=true;

            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }

        }
    }
static double SqurtBinarySearch(int n , int p ){
        double root = 0.0;
        int s =0 ;
        int e = n;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                e=mid-1;
            }
            else s=mid+1;
        }
        double incr= 0.1;
    for (int i = 0; i <=p; i++) {
        while (root*root<=n){
            root+=incr;
        }
        root-=incr;
        incr/=10;

    }
    return root;
}
static boolean isprime(int n ){
        int c =2 ;
         if(n==1){
             return false;
         }
         while(c*c<=n){
             if(n%c==0){
                 return false;
             }
             c++;
         }
         return true;
}

}
