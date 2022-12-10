package com.abdul;

public class DLL {
    Node head;
    int size;
    public void insertFirst(int val) {
        Node nn = new Node(val);
        nn.next=head;

        if (head != null) {

            head.prev = nn;


        }
        head=nn;
    }
    public  void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }

public void  insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node nn = new Node(val);
        Node temp= head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        nn.prev=temp;


}
public void displayRev(){
        Node temp = head;
    Node last =null;

    while (temp.next!=null){
            temp=temp.next;
            last=temp;
        }
        while (last!=null){
            System.out.print(last.val+"-->");
            last=last.prev;
        }


    System.out.println("End");
}
public void removeFirst(){

        head=head.next;
        head.prev=null;

}
public void removeLast(){

        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
}
public Node get(int idx){
        Node temp=head;
        for(int i =0;i<idx;i++){
            temp=temp.next;
        }
        return temp;

}
public void insert(int val ,int idx){

        Node temp=head;
        if(idx==0){
            insertFirst(val);
            return;
        }
        if (idx==size){
            insertLast(val);
            return;
        }
        for(int i =1;i<idx;i++){
            temp=temp.next;

        }
    Node nn =new Node(val,temp.next);
        temp.next=nn;
        nn.prev=temp;
        nn.next=temp.next.next;

}
public void remove(int idx){
    if(idx==0){
        removeFirst();
        return;
    }
    if (idx==size){
       removeLast();
        return;
    }
        Node temp=head;
        for(int i = 1; i<idx;i++ ){
            temp=temp.next;
    }
        temp.next=temp.next.next;

}

    class Node{
        Node prev;
        Node next;
        int val;

        public Node(int val,Node next ) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {

            this.val = val;
        }

        public Node(Node prev, Node next, int val) {
            this.prev = prev;
            this.next = next;
            this.val = val;
        }




    }

}
