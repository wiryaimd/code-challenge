package com.wiryaimd.codechallenge.ds.stack;

import com.wiryaimd.codechallenge.ds.linked_list.DoubleLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack implements Iterable<Integer> {

//    using linked list to store data
    private DoubleLinkedList myLinkedList = new DoubleLinkedList();

    public Stack(){}

    public int size(){
        return myLinkedList.getSize();
    }

    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }

    public void push(int val){ // int val cuz this class only support int
        myLinkedList.addLast(val);
    }

    public int pop(){
        return myLinkedList.removeLast();
    }

    public int peek(){
        return myLinkedList.peekLast();
    }

    @Override
    public Iterator<Integer> iterator() {
        return myLinkedList.iterator();
    }
}
