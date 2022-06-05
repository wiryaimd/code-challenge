package com.wiryaimd.codechallenge.hackerrank.ds.linkedlist;

public class CompareTwoLinkedList {

    public boolean compareTwoLinkedList(SinglyLinkedList.Node head1, SinglyLinkedList.Node head2){
        while(head1 != null || head2 != null){
            if(head1 == null){
                return false;
            }

            if(head2 == null){
                return false;
            }

            if(head1.data != head2.data){
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
