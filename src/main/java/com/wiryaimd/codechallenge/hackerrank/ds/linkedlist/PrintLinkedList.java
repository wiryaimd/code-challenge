package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class PrintLinkedList {

    public void printLinkedList(SinglyLinkedList.Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {

    }
}
