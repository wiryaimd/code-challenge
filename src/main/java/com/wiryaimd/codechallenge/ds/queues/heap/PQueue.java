package com.wiryaimd.codechallenge.ds.queues.heap;

import java.util.*;

// priority queue, menggunakan metode heap untuk sorting val dari terkecil/terbesar keatas
// min heap yach
// jadi heap nya berurut dari atas kecil ke terbesar
public class PQueue {

    private List<Integer> heap;

    // construction dengan o(n . log n)
    public PQueue(int[] data){
        heap = new ArrayList<>();

        // o(n . log n)
        for (int i = 0; i < data.length; i++) {
            add(data[i]);
        }
    }

    public int peek(){
        if (heap.isEmpty()) return -1;
        return heap.get(0);
    }

    // ex: SINK: i = 3, maka child left = 3(i7), child right = 5(i8)
    // [3, 4, 1, 2, 6, 9, 7, 3, 5, 8] // val
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] // index

    // SINK / tenggelam -> mengecek children val left dan right dari parent index
    // left children 2i + 1
    // right children 2i + 2

    // SWIM / keatas -> mengecek parent val dari index children
    // parent = (i - 1) / 2; // i = index children

    // insert
    // o log n
    public void add(int val){ // enqueue
        heap.add(val);

        swim(heap.size() - 1);
    }

    public int removeFirst(){ // dequeue
        return removeAt(0);
    }

    // o log n yachh
    public int removeAt(int index){
        if (index < 0 || heap.isEmpty()) return -1; // cek yekan

        int data = heap.get(index); // buat di return banh

        int lastIndex = heap.size() - 1;
        swap(index, lastIndex); // swap val yang akan dihapus ditukar dgn yg paling bawah

        heap.remove(lastIndex); // lalu dihapus
        if (index == lastIndex) return data; // ykl, kalo memang udh last index ya gaperlu sink

        int beforeSink = heap.get(index); // untuk cek apakah ada perubahan setalah sink
        sink(index); // sink untuk cek val yg telah ditukar, sapa tau lebih besar dari childnya yekan

        if (heap.get(index) == beforeSink){ // jika sink ga ngerubah val yg index itu maka, coba swim, sapa tau val nya lebih kecil dari parent
            swim(index);
        }
        return data;
    }

    // o log n
    // ke atas
    // menaikan posisi value jika val tersebut lebih kecil dari parentnya
    private void swim(int index){
        int parent = (index - 1) / 2; // mendapat index parent melalui index child

        // melakukan swim / cek naik
        while (index > 0 && heap.get(index) < heap.get(parent)){ // jika child lebih kecil dari parent, maka swap
            swap(index, parent);

            index = parent; // melanjutkan ke atas
            parent = (index - 1) / 2; // update parent index
        }
    }

    // o (log n) katanyach
    // SINK
    // untuk menurunkan posisi val jika val tersebut lebih besar dari child nya (namanya juga min heap yekan)
    private void sink(int index){
        while (true){
            int left = (index * 2) + 1;
            int right = (index * 2) + 2;
            int smallest = left; // anggap smalleftnya itu left yach

            // cek jika right nya kosong atau tidak dengan < heap.size
            // lalu cek jika right lebih kecil maka smallest = right
            if (right < heap.size() && heap.get(right) < heap.get(left)){
                smallest = right;
            }

            // cek jika left sudah paling ujung tree / lebih heap size dan
            // cek jika val smallest lebih besar dari parent maka break yach
            if (left >= heap.size() || heap.get(smallest) > heap.get(index)){
                break;
            }

            swap(index, smallest); // swap dongg kalo lanjas
            index = smallest; // update menurun yakan
        }
    }

    // ganti posisi array index 1 ke index 2
    private void swap(int index1, int index2){
        // swap
//        int tmp = heap.get(index1);
//        heap.set(index1, heap.get(index2));
//        heap.set(index2, tmp);
        // atau biar gampang di baca yach

        // swap
        int val1 = heap.get(index1);
        int val2 = heap.get(index2);

        heap.set(index1, val2);
        heap.set(index2, val1);
    }

    public List<Integer> getHeap() {
        return heap;
    }

    // less, swim, sink, swap


}
