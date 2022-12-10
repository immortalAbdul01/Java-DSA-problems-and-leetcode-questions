package immortal_abdul;

public class bitwisw {
    public static void main(String[] args) {
        System.out.println(Tothepoer(3,6));    }

    static int bitWiseFindSingleAmongDuplicates(int arr[])
    {
        int ans = 0 ;
        for (int i : arr) {
            ans ^= i;

        }
        return ans;
    }


    static int findSingleAmongDuplicates(int arr [ ]){
        int ans []= new int [101];
        int result=1;
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]++;

        }

        for (int i = 0; i <=100; i++) {
            if(ans[i]==1){
                result=i;
            }

        }

        return result;
    }
    static boolean findTwospower (int n){
        return (n&(n-1))==0;

    }
    static int magicNUmber(int n){
        int ans = 0 ;
        int base = 5 ;
        while (n>0){
            int last = n&1;
            n=n>>1;
            ans+=last*base;
            base = base*5;

        }
        return ans;
    }
    static int Tothepoer(int n ,int b){
        int ans = 1;

       while (b>0){
           if((b&1)==1) {
               ans *= n;
           }
               n=n*n;
               b=b>>1;

       }
       return ans;

    }

}
