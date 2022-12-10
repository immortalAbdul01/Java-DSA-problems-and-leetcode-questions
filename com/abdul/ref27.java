package com.abdul;

import java.util.function.LongUnaryOperator;

public class ref27 {
    public static void main(String[] args) {
        System.out.println("HEllo ");
        System.out.println("hello again");

//        l3.insertFirst(3);

        CircularLInkedList cl = new CircularLInkedList();
        cl.insert(4);
        cl.insert(2);
        cl.insert(4);

        boolean flag= cl.hasCircle(cl);
        int size = cl.length(cl);
        System.out.println(size);




    }
}
