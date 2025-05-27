package comeback;

public class CustomStack {
    protected int [ ]data ;

    int ptr = -1;

    private final static int DEFAULT_SIZE=10;

    public CustomStack(int size){
        this.data = new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);

    }

    public boolean push(int item) throws Exception {

        if(isFull()){
            throw new Exception("the stack is full try another tiem");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws  Exception{
        if(isEmpty()){
            throw new Exception("the stack is empty try later");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("the stack is empty nothing to show");
        }
        return data[ptr];
    }
public boolean isFull(){
        return data.length-1==ptr;
}
public boolean isEmpty(){
        return ptr==-1;
}

}
