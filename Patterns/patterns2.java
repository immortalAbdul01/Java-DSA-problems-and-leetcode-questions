package Patterns;

public class patterns2 {
    public static void main(String[] args) {
//        System.out.println("yes this is working you can start coding");
        //question 1 printing patterns
//        *****
//        *****
//        *****
//        *****


//        for(int i =1;i<=4;i++){ // it is used to print vertical stars or row
//            for(int j =1;j<=5;j+
//            +){//it is used to print horizontal stars or row
//            System.out.print("*");
//        }
//            System.out.println();}



        //question 2 printing patterns
//        ****
//        *  *
//        *  *
//        ****


//        for (int i =1;i<8;i++){//this will generate rows
//            for(int j=1;j<8;j++){//this will generate columns
//                if(i==1||i==7||j==1||j==7) {//it will check that the stars are at i=1 and i==n as well as for j
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");//space for hologram rectangle
//                }
//
//            }
//            System.out.println();
//        }

        //question 3 print the pattern like this
//        *
//        **
//        ***
//        ****
//        for (int i =1;i<=5;i++){
//            for(int j =1;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //question 4 print the pattern like this
//        ****
//        ***
//        **
//        *
////
//        for(int i =6;i>1;i--){
//            for(int j=1 ;j<i;j++){
//                System.out.print("X");
//
//            }
//            System.out.println();
//

//    for (int i =1 ; i<=5;i++){ // in these question we used two inner loops to print whitespaces
//        for(int j =1;j<=5-i;j++){ // this loop is used to print whitespaces which are actually n-1
//            System.out.print(" ");
//        }
//        for (int j =1 ; j<=i;j++){ // this loop is used to print  normal stars
//            System.out.print("X");
//        }
//        System.out.println();
//    }
//        for (int i =1;i<=6;i++){ // same method for above
//            for(int j=1;j<=i;j++){
//                System.out.print(j); // just in this case printing varibles instead of stars
//            }
//            System.out.println();
//        }



        //question 7
//        print the pattern
//                12345
//                1234
//                123
//                12
//                1

//        for(int i=5 ; i>=1; i--){ // outer loop going in reverse order
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }




        //question 8 print the pattern

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15




//int no=0;
//        for(int i =1;i<6;i++){
//            for(int j =1 ;j<=i;j++){
//                no++;
//                System.out.print(no+" ");
//
//            }
//            System.out.println();
//        }


        //question 9 print the pattern
//        1
//        01
//        101
//        0101
//        10101

//        for(int i =1 ; i<=5;i++){
//            for(int j =1 ; j<=i;j++){
//                int sum= i+j;
//                if(sum%2==0){
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(0);
//                }
//
//            }
//            System.out.println();
//        }



        // queston 10
//        print like this


//        for(int i =1 ; i<5;i++){
//            for (int j =1 ;j<5-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=5 ;j>1;j--){
//                System.out.print("X");
//            }
//            System.out.println();
//        }

        // question 11
//        print the pattern
//        //     1
//            2    2
//        3      3    3


//        for(int i =1 ; i<=6; i++){
//            int n= 6-i;
//            int divide= n/2;
//            for(int j =1 ;j<=n;j++){
//                System.out.print(" ");
//            }
//            for (int j =0 ; j<i ;j++ ){
//                System.out.print(i+" ");
//            }
////            for(int j =1 ;j<6-i/2;j++){
////                System.out.print(" ");
////            }
//            System.out.println();
//
//        }


//
//        for(int i =1 ; i<=6;i++){
//            for(int j =1 ;j<6-i;j++){
//                System.out.print(" ");
//
//            }
//            for(int j = i;j>=1;j--){
//                System.out.print(j);
//            }
//            for(int j =2 ; j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
}

}