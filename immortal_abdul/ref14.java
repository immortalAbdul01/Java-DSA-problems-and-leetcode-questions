package immortal_abdul;

import java.util.ArrayList;

public class ref14 {
    //Q1 print all the permutation of a string
    public static void permutationStr(String str , String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i =0;i<str.length();i++){
            char curreCh=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permutationStr(newStr,perm+curreCh);
        }
    }
    // Count total paths in a maze to move from (0,0) to (n-1,m-1)
    // given n=3,m=3
    // condition you can only move right and downwords
    public static int countPaths(int i , int  j ,int n , int m){
        if(i==n-1&&j==m-1){
            return 1;
        }
        if (i==n||j==m){
            return 0;
        }
        int downwords=countPaths(i+1,j,n,m);
        int right=countPaths(i,j+1,n,m);
        return downwords+right;
    }
    //Q3 place 1*m tiles in a floor of size n*m

    public static int placeTiles(int n , int m ){
        if (n == m) {
            return 2;

        }
        if (n < m) {

            return 1;
        }
        int Verticle=placeTiles(n-m,m);
        int Horizontal=placeTiles(n-1,m);
        return Verticle+Horizontal;
    }
    // Q4 find the number of ways in which you can invite n people to your party single or in pairs
    public static int ways(int n){
        if (n<=1){
            return 1;
        }
        int single=ways(n-1);
        int pair=(n-1)*ways(n-2);
        return single+pair;
    }
    // Q5 print all the subsets of a set of first n natural numbers
    public static void subset(int n , ArrayList<Integer>sub){
        if (n == 0) {

            for (int i =0 ;i<sub.size();i++){
                System.out.print(sub.get(i));
            }
            System.out.println();
            return;
        }
//        to add a number in a arraylist
        sub.add(n);
        subset(n-1,sub);

        // to remove the number from an arraylist
        sub.remove(sub.size()-1);
    subset(n-1,sub);
    }

    public static void main(String[] args) {
        System.out.println("currently i am taking notes");
        permutationStr("abc","");
        System.out.println(countPaths(0,0,3,4
        ));
        System.out.println(placeTiles(4,2));
        System.out.println(ways(2));
        ArrayList<Integer> no = new ArrayList<>();
        subset(3,no);
    }
}
