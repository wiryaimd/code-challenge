package com.wiryaimd.codechallenge.ds.queues.heap;

import java.util.List;

public class PriorityQueuesDs {

    public static void main(String[] args) {


        // priority queues
        // mirip dengan ds queues biasa, bedanya tiap element pada queues ini memiliki prioritas
        // prioritas yang ada di tiap elemen tersebut membuat urutan menjadi berbeda saat melakukan dequeue

        // for ex:
        // terdapat data dalam PQ(priority queues) {4, 9, 1, 3, 12}
        // terdapat kondisi dimana prioritas utama untuk deq adalah nilai yang terkecil
        // so..
        // pq.poll() -> return 1; {4, 9, 3, 12}
        // pq.poll() -> return 3; {4, 9, 12}
        // pq.add(2) -> {4, 9, 12, 2}
        // pq.poll() -> return 2; {4, 9, 12}
        // dan begitupun seterusnya

        // jadi bagaiman logic/algoritma/cara kerja dari priority queues
        // apakah ia melakukan sort setiap saat enq? agar bisa deq sesuai prioritas? (tet tod ngentod karena ineffective)
        // jawabannya adalah menggunakan HEAP

        // HEAP
        // data struktur TREE (jadi bukan linear ds),

        // MIN PQ & MAX PQ
        // jadi min pq -> adalah memprioritaskan element terkecil untuk di deq terlebih dahulu
        // lalu max pq -> sebaliknya, prioritas element terbesar untuk di deq

        // conver min pq to max pq
        // jadi untuk mengubah min ke max pq kita gunakan negasi
        // intinya reverse nilai valuenya antara negatif/postf ynl
        // terconvert deh jaidnya yakan


        // BINARY HEAP
        // sama dengan binary tree, dimana setiap nodes hanya memiliki dua children

        System.out.println(1 / 2);

        int[] ex = {3, 4, 1, 2, 6, 9, 7, 3, 5, 8};
        PQueue pQueue = new PQueue(ex);
        pQueue.add(2);
        pQueue.add(10);
//        pQueue.add(-1);
        pQueue.add(4);
        pQueue.add(0);
//        pQueue.add(-3);

        System.out.println("peek: " + pQueue.peek());

        for(int val : pQueue.getHeap()){
            System.out.print(val + " "); // correct VVV
        }
        System.out.println("after rm");

        System.out.println("rm f: " + pQueue.removeFirst());
        System.out.println("rm f: " + pQueue.removeFirst());


        for(int val : pQueue.getHeap()){
            System.out.print(val + " "); // correct VVV
        }

    }

}
