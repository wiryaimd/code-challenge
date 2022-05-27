package com.wiryaimd.codechallenge.ds.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedDs {

    public static void main(String[] args) {

        LinkedList<String> cekMethod = new LinkedList<>();

        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addLast(24);
        linkedList.addLast(14);
        linkedList.addLast(2434);
        linkedList.addLast(36);
        linkedList.addLast(-123);
        linkedList.addLast(-123);
        linkedList.addLast(-123);
        linkedList.addLast(-123);
        linkedList.addLast(423);
        linkedList.addLast(423);
        linkedList.addLast(-123);
        linkedList.addLast(342);
        linkedList.addLast(345);

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            int val = iterator.next();
            System.out.println(val);
        }
        System.out.println("size: " + linkedList.getSize());

        linkedList.addFirst(-34343);
        int f = linkedList.peekFirst();
        System.out.println("peek f: " + f);
        System.out.println("size: " + linkedList.getSize());

//        linkedList.clear();
        int cek = linkedList.removeAt(3);
        System.out.println("removed: " + cek);

        Iterator<Integer> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()){
            int val = iterator2.next();
            System.out.println(val);
        }

        System.out.println("========");

        int ind = linkedList.indexOf(36);
        int ind2 = linkedList.indexOf(342);
        int ind3 = linkedList.indexOf(24);
        int ind4 = linkedList.indexOf(423);

        System.out.println(ind + " " + ind2 + " " + ind3 + " " + ind4);




    }

}
