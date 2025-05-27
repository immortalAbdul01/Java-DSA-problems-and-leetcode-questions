package comeback;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQues {


    public static void main(String[] args) throws Exception {
CustomStack stack = new CustomStack();

//
//        Stack <Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(1);
        stack.push(2);
        stack.push(22);
        stack.push(15);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.push(89));
        System.out.println(stack.pop());
        System.out.println(stack.peek());


//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> que = new LinkedList<Integer>() ;
//        que.add(12);
//        que.add(56);
//        que.add(11);
//        que.add(10);
//        que.add(19);
//        System.out.println(que.remove());
//        System.out.println(que.peek());

    }
}
