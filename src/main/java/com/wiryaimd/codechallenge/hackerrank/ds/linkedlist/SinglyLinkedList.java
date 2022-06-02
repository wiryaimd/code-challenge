package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class SinglyLinkedList {

    public static class Node{
        public Node next;
        public Node prev;
        public int data;

        public Node(){}

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public SinglyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
}
