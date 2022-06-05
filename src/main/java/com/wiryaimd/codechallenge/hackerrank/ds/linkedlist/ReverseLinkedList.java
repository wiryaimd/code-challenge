package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class ReverseLinkedList {

    public SinglyLinkedList.Node reverseLinkedList(SinglyLinkedList.Node head){
        SinglyLinkedList.Node prev = null;
        SinglyLinkedList.Node node = head;
        SinglyLinkedList.Node right = head;

        while (node != null){
            right = right.next;
            node.next = prev;
            prev = node;
            node = right;
        }

        return prev;
    }

    public static void main(String[] args) {


    }

}


