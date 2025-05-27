package comeback;

public class CircularQueue {

    protected  int [] data;
    private static final int DEFAULT_SIZE=10;

    protected int front =0 ;
    protected int end = 0;
    protected int size = 0;


    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
public boolean isEmpty(){
        return size ==0
                ;
}
public boolean isFull(){
        return size == data.length-1;

}

public boolean insert (int item) throws Exception{
        if(isFull()){
            throw new Exception("the circular queue is full");
        }
        data[end++]=item;
        end = end%data.length;
        size++;
        return true;
}
public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("the circualr queue is empty there is nothing to rmeove");
        }

        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
}

public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("the circualr queue is empty there is nothing to show");

        }

        return data[front];
}

public void Display() {
        if(isEmpty()){
            System.out.println("it's empty ");
            return;

        }

        int i = front;
        do{
            System.out.println(data[i]);
            i++;
            i= i% data.length;

        } while(i!=end);
}

}
