package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class InsertTailFromHead {

    public SinglyLinkedList.Node insertTailFromHead(SinglyLinkedList.Node head, int val){
        if (head == null){
            head = new SinglyLinkedList.Node();
            head.data = val;
            return head;
        }

        SinglyLinkedList.Node node = head;
        while (node.next != null){
            node = node.next;
        }
        node.next = new SinglyLinkedList.Node();
        node.next.data = val;

        return head;

    }

    public static void main(String[] args) {

    }
}
