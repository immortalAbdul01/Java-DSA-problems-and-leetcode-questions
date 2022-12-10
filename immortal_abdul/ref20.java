package immortal_abdul;

import java.util.*;
class LL{
    Node head;
    int size=0;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;

        }

    }
    public void addFirst(String data){
        size++;

        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        else {
            newNode.next=head;// when you add an element then the next elem becomes its head
            head=newNode;//and here head becomes new element (added element)

        }

    }
    public void addLast(String data){
        Node newNode= new Node(data);
        size++;

        if(head==null){

            newNode.next=head;
           head=newNode;
        }

        Node Current =head; // creating an current node to traverse from whole linked list
        while (Current.next!=null){ // until next element of current becomes null
            Current=Current.next;   // we are updating(traversing )  current as currentNext
        }
        Current.next=newNode;
    }
    public void printList(){
        if (head==null){
            System.out.println("The list is empty");
        }
        Node Current =head;
        while (Current!=null){
            System.out.print(Current.data+"->");
            Current=Current.next;
        }
        System.out.println("NULL");
    }

public void deltef(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        size--;
}
public void deleteLast(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    if(head.next==null){
        head=null;
        return;
    }
    Node sl=head;
    Node l=head.next;
    while (l.next!=null){
        l=l.next;
        sl=sl.next;
    }
    sl.next=null;
    size--;

}

public void getSize(){
        if (head==null){
            size=0;
        }
    System.out.println(size);
}

}
public class ref20
{
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i =0 ;i<arr.size();i++){
            if(arr.get(i)<0){
                neg++;
            }
            else if(arr.get(i)>0){
                pos++;
            }
            else{
                zero++;
            }
        }
        System.out.println(pos/6);
        System.out.println(neg/6);
        System.out.println(zero/6);
    }


public static void plusMinus2(int [] arr){
        float pos=0;
        float neg=0;
        float zero=0;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]<0){
                neg++;

            }
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]==0) {
                zero++;
            }
        }
//        do resultPos=pos/ arr.length;
    float n = arr.length;
    System.out.format("%.6f", pos/n);
    System.out.println();
    System.out.format("%.6f", neg/n);
    System.out.println();
    System.out.format("%.6f", zero/n);

}
public static void maxMin(List <Integer>arr){
        ArrayList<Integer> all =new ArrayList<>();
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int sum5 = 0;
        for(int i = 1 ;i< arr.size();i++) {



            sum1 += arr.get(i);
        }  for(int i = 0 ;i< arr.size();i++) {


            if(i!=1){
                sum2+= arr.get(i);

            }

        }for(int i = 0 ;i< arr.size();i++) {


            if(i!=2){
                sum3 += arr.get(i);

            }

        }for(int i = 0 ;i< arr.size();i++) {


            if(i!=3){
                sum4 += arr.get(i);

            }

        }for(int i = 0 ;i< arr.size();i++) {


            if(i!=4){
                sum5 += arr.get(i);

            }

        }
        all.add(sum1);
        all.add(sum2);
        all.add(sum3);
        all.add(sum4);
        all.add(sum5);
//
    System.out.println(Collections.min(all)+" "+ Collections.max(all));
}
    public static void BirthDayCandles(List <Integer>arr){

        int max= Collections.max(arr);
        int candles=0;
        for (int i =0 ;i< arr.size();i++){
            if(arr.get(i)==max){
                candles++;

            }
        }
        System.out.println(candles);
    }
    public static void maxFromarray(int arr[]){
        int max=0;
        for (int i =0 ; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {

        LinkedList<Long> list = new LinkedList<>();
        LL list1=new LL();
        list1.addFirst("a");
        list1.addFirst("is");
        list1.addLast("wow");
        list1.deltef();
        list1.deleteLast();
        list1.addLast("hello");
        list1.addLast("hello");
        list1.addFirst("cartoon");
        list1.deleteLast();
        list1.deleteLast();
        list1.deleteLast();
        list1.deleteLast();
        list1.addFirst("rahul");
        list1.addLast("is");
        list1.addLast("good");
        list1.printList();
        list1.getSize();
        list.addFirst(5L);
        list.addFirst(3L);
        list.addFirst(2L);
        list.addFirst(1L);
        list.addLast(78924389347789L);
        list.add(1,15L);
//        System.out.println(list);
//
//        Scanner sc =new Scanner(System.in);
//       ArrayList<Integer> arr= new ArrayList<>();
//      arr.add(1);
//      arr.add(2);
//      arr.add(11);
//      arr.add(5);
//      arr.add(11);
//
//      int[] arr1={
//              1,2,33,4,5
//      };
//      int n = 6;
//        for(int i = 0 ; i<n;i++){
//            for (int j =0;j<n-i;j++){
//                System.out.print(" ");
//            }
//
//
//            System.out.print(" ");
//            for(int j = 0 ; j<i;j++){
//
//
//                System.out.print("#");
//            }
//            System.out.println();
//        }
//        BirthDayCandles(arr);
//        maxFromarray(arr1);

    }
}
