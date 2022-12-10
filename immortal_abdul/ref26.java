package immortal_abdul;

import java.util.ArrayList;
import java.util.List;

public class ref26 {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        ArrayList <Integer>l1=new ArrayList<>();
        ArrayList <Integer>l2=new ArrayList<>();
        int app=0;
        int orange=0;
        // running for loop for apple
        for(int i = 0 ;i<apples.size();i++){
            l1.add(apples.get(i)+a);

        }
        for(int i = 0; i<oranges.size();i++){
            l2.add(oranges.get(i)+b);
        }
        for(int i = 0 ;i<l1.size();i++){
            int temp=l1.get(i);
            if(temp>=s&&temp<=t){
                app++;

            }
        }
        // for oranges
        for(int i =0;i<l2.size();i++){
int temp=l2.get(i);
            if(temp>=s&&temp<=t){
                orange++;
            }

        }
        System.out.println(app);
        System.out.println(orange);




}
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
ArrayList<Integer> l1 = new ArrayList<>();
ArrayList<Integer> l2 = new ArrayList<>();
int a=0;
ArrayList<String> list=new ArrayList<>();
        for(int i =0;i<1000000;i++){
           l1.add(x1+=v1);
           l2.add(x2+=v2);



        }
     for(int i =0 ;i<l1.size();i++){
         if(l1.get(i)==(l2.get(i))){
            list.add("yes");
         }
         else {
             list.add("no");
         }
     }
     for(int i = 0 ;i<list.size();i++){
         if(list.get(i)=="yes"){
            a++;
         }

     }
     if(a>0){
        return "YES";
     }
     else {
         return "NO";
     }
    }
    public static void main(String[] args) {
        ArrayList <Integer>l1=new ArrayList<>();
        ArrayList <Integer>l2=new ArrayList<>();
        l1.add(-2);
        l1.add(2);
        l1.add(1);
        l2.add(5);
        l2.add(-6);
//        countApplesAndOranges(7,11,5,15,l1,l2);

        System.out.println(  kangaroo(2081, 8403, 9107, 8400));
    }
}
