package com.wiryaimd.codechallenge.ds.array;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayDs {

    public static void main(String[] args) {
        List<String> anjae = new ArrayList<>();

        int cek = 0;

        System.out.println(cek++);
        System.out.println(++cek);

        Array<String> myArr = new Array<>();
        myArr.add("mengontol amat aowkawoaw kont");
        myArr.add("bjerrr aselolewww");
        myArr.add("bjerrr aselolewww 2");
        myArr.add("bjerrr aselolewww3 ");
        myArr.add("bjerrr aselolewww 4");

        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }

        myArr.set(3, "jadi gini borr kngot");

        String res = myArr.get(myArr.size() - 1);
        System.out.println(res);

        myArr.removeAt(0);

        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }
    }

}

// contoh ds array banh
@SuppressWarnings("unchecked") // jadi supressWarings untuk ngilangin annoying warning yach
    // serializable digunakan untuk mengubah suatu objek/class menjadi urutan bit agar dapat disimpan kedalam media penyimpanan atau di kirim melalui jaringan seperti http ... its maybee
class Array<T> implements Iterable<T>, Serializable{

    private T[] array;
    private int length; // known user length of array
    private int capacity; // actual length array

    public Array(){
        this(16); // use 16 as default....hemmm
    }

    public Array(int capacity){
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity size: " + capacity);
        array = (T[]) new Object[capacity];
    }

    private void checkIndex(int index){
        if (index > length || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }

    public T set(int index, T val){
        checkIndex(index);
        array[index] = val;
        return array[index];
    }

    // O(1), obviously brooo njim
    public T get(int index){
        checkIndex(index);
        return array[index];
    }

    // notation O(n)
    public void add(T val){
        // dengan ngecek kapasitas static array nya masih cukup untuk add atau tidak
        // jika tidak maka dikali 2 kemudian copy value array lama ke baru
        if (length + 1 >= capacity){
            if (capacity == 0){
                capacity = 1;
            }else{
                capacity *= 2;
            }

            T[] arrNew = (T[]) new Object[capacity];
            // ini yg bikin jadi O n notation yachh
            for (int i = 0; i < length; i++) {
                arrNew[i] = array[i];
            }
            array = arrNew;
        }

        array[length] = val;
        length += 1;
    }

    public T removeAt(int index){
        checkIndex(index);
        T data = array[index];

        T[] arrNew = (T[]) new Object[length - 1];
        for (int i = 0, j = 0; i < length - 1; i++, j++) {
            if (i == index){
                j += 1;
            }
            arrNew[i] = array[j];
        }
        array = arrNew;
        length = array.length;

        return data;
    }

    public int size(){
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
