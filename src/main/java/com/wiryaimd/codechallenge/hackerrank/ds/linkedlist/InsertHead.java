package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;


public class InsertHead {

    public SinglyLinkedList.Node insertHead(SinglyLinkedList.Node head, int val){
        if (head == null){
            head = new SinglyLinkedList.Node(val);
            return head;
        }

        SinglyLinkedList.Node node = new SinglyLinkedList.Node(val);
        node.next = head;

        head = node;
        return head;
    }

    // another challenge
//    public SinglyLinkedList.Node insertAtSpecificIndex(){
//        int index = 0;
//
//        SinglyLinkedListNode node = llist;
//        while(node != null){
//            if(index + 1 == position){
//                SinglyLinkedListNode tmp = node.next;
//                node.next = new SinglyLinkedListNode(data);
//                node.next.next = tmp;
//                break;
//            }
//
//            node = node.next;
//            index += 1;
//        }
//        return llist;
//    }

    public static void main(String[] args) {

    }
}
