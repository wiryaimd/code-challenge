package com.wiryaimd.codechallenge.ds.queues;

import java.util.LinkedList;

public class Queue {

    private LinkedList<String> linkedList = new LinkedList<>(); // use linked list for queue

    public Queue(){}

    public void offer(String val){ // enqueue
        linkedList.addLast(val);
    }

    public String poll(){ // dequeue
        return linkedList.removeFirst();
    }

    public String peek(){
        return linkedList.peekFirst(); // peek val pertama yang akan di deq
    }


}
