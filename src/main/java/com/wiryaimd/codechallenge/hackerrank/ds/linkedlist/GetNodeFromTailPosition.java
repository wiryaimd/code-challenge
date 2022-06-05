package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class GetNodeFromTailPosition {

    public int getNode(SinglyLinkedList.Node llist, int positionFromTail){
        SinglyLinkedList.Node node = llist;
        SinglyLinkedList.Node an = llist;

        int i = 0;
        while(node != null){
            node = node.next;

            if(i > positionFromTail){
                an = an.next;
            }
            i += 1;
        }

        return an.data;
    }

    public static void main(String[] args) {

    }

}
