package com.wiryaimd.codechallenge.ds.linked_list;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable<Integer> {

    private int size = 0;
    private Node head = null, tail = null;

    private class Node{

        protected int val;

        protected Node next, prev;
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        if (isEmpty()){
            return;
        }

        Node tmp = head;
        while (tmp != null){
            Node next = tmp.next;
            tmp.next = tmp.prev = null;
            tmp = next;
        }
        head = tail = null;
        size = 0;
    }

    public void add(int val){
        addLast(val);
    }

    public void addFirst(int val){
        if (isEmpty()){
            head = tail = new Node(val, null, null);
        }else {
            head.prev = new Node(val, head, null);
            head = head.prev;
        }
        size += 1;
    }

    public void addLast(int val){
        if (isEmpty()){
            head = tail = new Node(val, null, null);
        }else {
            tail.next = new Node(val, null, tail);
            tail = tail.next;
        }
        size += 1;
    }

    public int peekFirst(){
        if (isEmpty()) throw new RuntimeException("stupid empty");
        return head.val;
    }

    public int peekLast(){
        if (isEmpty()) throw new RuntimeException("a yo stupid boy");
        return tail.val;
    }

    public int removeFirst(){
        int val = head.val;
        head = head.next;
        size -= 1;

        if (isEmpty()){
            tail = null;
        }{
            head.prev = null;
        }

        return val;
    }

    public int removeLast(){
        int val = tail.val;
        tail = tail.prev;
        size -= 1;

        if (isEmpty()){
            head = null;
        }{
            tail.next = null;
        }

        return val;
    }

    public int removeAt(int index){
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("anjim luwh banh");

        Node tmp = head;

        int i = 0;
        while (i != index){
            tmp = tmp.next;
            i+= 1;
        }

        return remove(tmp); // need complete this
    }

    private int remove(Node node){
        if (node.prev == null){
            return removeFirst();
        }

        if (node.next == null){
            return removeLast();
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;

        int deletedVal = node.val;

        node.next = node.prev = null;
        size -= 1;

        return deletedVal;
    }

    public int indexOf(int val){
        Node tmp = head;
        int i = -1;

        while (tmp.val != val){
            if (tmp.next == null){
                return -1;
            }
            tmp = tmp.next;
            i += 1;
        }
        return i;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            private Node tmp = head;

            @Override
            public boolean hasNext() {
                return tmp != null;
            }

            @Override
            public Integer next() {
                int val = tmp.val;
                tmp = tmp.next;
                return val;
            }
        };
    }

    public int getSize() {
        return size;
    }
}


