package com.abdul;


import org.w3c.dom.Node;

class LinkList{
    Node head;
    Node tail;
    int size=0;
    class Node{
        Node next;
        int val;

        public Node(int val,Node next) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }
    public void insertFirst(int val){
        Node nn=new Node(val);
        if(tail==null){
            tail=head;

        }
        nn.next=head;
        head=nn;
        size++;


    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;

        }
        System.out.println("End");
    }
    public void insertLast(int val){
        Node newNode=new Node(val);
        if(tail==null){

            insertFirst(val);
            return;
        }

        tail.next=newNode;
        tail=newNode;

        size++;
    }
    public void removeFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    public Node get(int idx){
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;

        }
        return temp;
    }
    public void removeLast(){
        if(size<=1){
            removeFirst();
            return;
        }
        Node sl = get(size-2);
        tail=sl;
        tail.next=null;


        size--;
    }

    public void remDup(){
        Node temp=head;




        while (temp.next!=null){

            if(temp.val==temp.next.val){
                temp.next=temp.next.next;



            size--;
            }
            else {
                temp=temp.next;
            }

        }
        tail=temp;
        tail.next=null;

     }

     // MOST POPULAR QUESTION FOR INTERVIEW

     public void reverse(){
        if(size<2){
            return ;
        }
        Node prev= null;
        Node pres=head;
        Node next = pres.next;
        while (pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }



        }
        head=prev;

     }
public static LinkList mergeTwoList( LinkList first , LinkList second){
Node f=first.head;
Node s=second.head;
    LinkList ans =new LinkList();

while(f!=null&&s!=null){
    if(f.val<s.val){
        ans.insertLast(f.val);
        f=f.next;
    }
    else {
        ans.insertLast(s.val);
        s=s.next;
    }

}
while (f!=null){
    ans.insertLast(f.val);
    f=f.next;
}

while (s!=null){
    ans.insertLast(s.val);
    s=s.next;
}
return ans;


}
    public void insert(int val,int idx){
        Node temp=head;
        if(idx==0){
            insertFirst(val);
        }
        if(idx==size){
            insertLast(val);
        }
        for (int i =1;i<idx;i++){
            temp=temp.next;

        }
        Node nn = new Node(val,temp.next);

        temp.next=nn;
        size++;

    }
    public void Remove(int idx){
        if(idx==0){
            removeFirst();
            return;
        }
        if(idx==size){
            removeLast();
            return;
        }
        Node temp=head;
        for(int i = 1 ;i<idx;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;

    }
public boolean hasCircle(LinkList l1){
        Node first=l1.head;
        Node second=l1.head;
        while (first!=null&&first.next!=null){
            first=first.next.next;
            second=second.next;
            if(first==second){
                return true;
            }
        }
        return false;


}
    public int length(LinkList l1){
        LinkList.Node first = l1.head;
     LinkList.Node second = l1.head;
        int size=0;
        while(first!=null&&first.next!=null){
            first=first.next.next;
            second=second.next;
            if(first==second){
             LinkList.Node temp =second;
                do {
                    temp=temp.next;
                    size++;
                }while (temp!=second);

                return size;
            }
        }
        return 0;
    }
    public int findMiddle(LinkList l ){
        Node f= l.head;
        Node s= l.head;
        while (f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s.val;
    }
    public void sortLinkList(){
        Node temp=head;
        if(head.next.val<head.val){
            Node temp2=head;
            head=head.next;
            head.next=temp2;

        }
        while (temp.next!=null){
            if(temp.next.val<temp.val){
                Node temp2=temp;
                temp=temp.next;
                temp.next=temp2;
            }


            temp=temp.next;


        }
    }
public Node find(int val) {
    Node temp = head;
    while (temp!=null){
        if(temp.val==val){
            return temp;
        }
        temp=temp.next;
}
    return null;
}

}

















































//public class LinkList {
//    Node head;
//    Node tail;
//    int size=0;
//
//    private class Node{
//        Node next ;
//        int val;
//
//        public Node(int val) {
//            this.val = val;
//        }
//
//        public Node(int val,Node next) {
//            this.next = next;
//            this.val = val;
//        }
//
//    }
//    public void insertFirst(int val){
//        Node newNode=new Node(val);
//        newNode.next=head;
//        head=newNode;
//        if(tail==null){
//            tail=head;
//        }
//        size++;
//    }
//    public void insert(int val,int idx){
//        if(idx==0){
//            insertFirst(val);
//            return;
//
//        }
//        if(idx==size){
//            insertLast(val);
//            return;
//        }
//        Node temp=head;
//
//        for(int i =1;i<idx;i++){
//            temp=temp.next;
//        }
//        Node newNode=new Node(val, temp.next);
//        temp.next=newNode;
//        size++;
//    }
//    public void removeFirst(){
//        head=head.next;
//
//        if(head==null){
//            tail=null;
//        }
//        size--;
//    }
//    public void remove(int idx){
//        if (idx == 0) {
//
//            removeFirst();
//            return;
//        }
//        if(idx==size-1){
//            removeLast();
//            return;
//        }
//        Node prev=get(idx-1);
//        prev.next=prev.next.next;
//        size--;
//    }
//    public void removeLast(){
//
//    if(size<=1){
//        removeFirst();
//        return;
//    }
//    Node secondLast=get(size-2);
//    tail=secondLast;
//    tail.next=null;
//    size--;
//        }
//    public Node get(int idx){
//        Node temp =head;
//        for(int i =0;i<idx;i++){
//            temp=temp.next;
//        }
//        return temp;
//    }
//    public Node find(int value){
//        Node temp= head;
//        while(temp!=null){
//            if (temp.val==value){
//                return temp;
//            }
//            temp=temp.next;
//        }
//       return null;
//    }
//
//    public void insertLast(int val){
//        Node newNode=new Node(val);
//
//        tail.next=newNode;
//        tail=newNode;
//        if(head==null){
//            insertFirst(val);
//            return;
//        }
//        size++;
//    }
//    public void display(){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.val+"-->");
//            temp=temp.next;
//        }
//        System.out.println("End");
//    }
//
//}
