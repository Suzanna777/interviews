package com.bank.sydeo.queueCollection;

public class QTest {
    public static void main(String[] args) {
    MyQueue<Integer> mq = new MyQueue<>();

    mq.enqueue(1);
    mq.enqueue(2);
    mq.enqueue(3);
    mq.enqueue(4);
    mq.enqueue(5);

        System.out.println("size of Q is " + mq.size);
        System.out.println("front of Q is " + mq.peek());
        System.out.println("front Q removed " + mq.dequeue());
        System.out.println("front of Q now is  " + mq.peek());


    }

}
