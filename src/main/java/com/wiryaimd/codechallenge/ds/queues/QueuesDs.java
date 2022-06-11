package com.wiryaimd.codechallenge.ds.queues;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueuesDs {

    public static void main(String[] args) {

        // terdapat 2 method utama pada queues, yaitu
        // enqueue = offer(var): data masuk/add (di bagian belakang / enq arr[len])
        // dequeue = poll():val : data keluar/remove (di bagian depan / deq arr[0])

        // other method
        // peek: return value di bagian depan list / arr[0]

//        java.util.Queue<String> queueJ = new PriorityQueue<>();
//        queueJ.offer("sadsad");
//        queueJ.peek();
//        queueJ.poll(); // removes first data: dan return null kalau queue is empty
//        queueJ.remove(); // bedanya ama poll: akan trhow excep kalau queue is empty

        Queue queue = new Queue();
        queue.offer("assdaads");
        queue.offer("assdaads2");
        queue.offer("assdaads3");
        queue.poll();


    }
}
