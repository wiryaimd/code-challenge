package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class DeleteNodeByIndex {

    public SinglyLinkedList.Node deleteNode(SinglyLinkedList.Node llist, int position){
        if(position == 0){
            llist = llist.next;
            return llist;
        }
        int index = 0;

        SinglyLinkedList.Node node = llist;
        while(node.next != null){
            if(index + 1 == position){
                node.next = node.next.next;
                break;
            }
            node = node.next;
            index += 1;
        }

        return llist;
    }

    public static void main(String[] args) {

    }
}
