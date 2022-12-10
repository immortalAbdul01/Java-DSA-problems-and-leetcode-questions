package LinkedList;

public class CircularLInkedList {
    Node head;
    Node tail;

    public CircularLInkedList() {
        this.head = head;
        this.tail = tail;
    }

    public void  insert(int val){
        Node nn= new Node(val);
        if (head==null){
            head=nn;
            tail=nn;
        }
        tail.next=nn;
        nn.next=head;
        tail=nn;

    }
    public void display(){
        Node temp=head;
        if(head!=null){
do {
    System.out.print(temp.val+"->");
    temp=temp.next;
}
while (temp!=head);
            System.out.println("head");
        }
    }
    public boolean hasCircle(CircularLInkedList l1){
        CircularLInkedList.Node first=l1.head;
        CircularLInkedList.Node second=l1.head;
        while (first!=null&&first.next!=null){
            first=first.next.next;
            second=second.next;
            if(first==second){
                return true;
            }
        }
        return false;


    }
    public int length(CircularLInkedList l1){
        Node first = l1.head;
        Node second = l1.head;
        int size=0;
        while(first!=null&&first.next!=null){
            first=first.next.next;
            second=second.next;
            if(first==second){
                Node temp =second;
do {
    temp=temp.next;
    size++;
}while (temp!=second);

             return size;
            }
        }
        return 0;
    }


    public void  delete(int val){
        Node temp=head;
        if(head.val==val){
            head=null;
        }
        if(head!=null){
            do {
                if (temp.next.val==val){
                    temp.next=temp.next.next;
                }
                temp=temp.next;
            }while (temp!=head);
        }
}
//public Node deleteCycle(CircularLInkedList ls
//){
//        Node first=ls.head;
//        Node second=ls.head;
//        while (first!=null&&first.next!=null){
//            first=first.next.next;
//            second=second.next;
//            if (first==second){
//                length();
//            }
//
//        }
//}

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
