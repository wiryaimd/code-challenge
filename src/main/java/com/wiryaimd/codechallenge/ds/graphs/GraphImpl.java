package com.wiryaimd.codechallenge.ds.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphImpl {


    // dengan O n complexity (atau O(|V|) atau O(|E|) )
    // time complexity ini tidak efisien jika dipakai untuk find, check node, dll
    public static void main(String[] args) {

        // sample graph yach..
        List<String> vertex = new ArrayList<>(); // vertex == node ... jadi ada a-h node
        vertex.add("A");
        vertex.add("B");
        vertex.add("C");
        vertex.add("D");
        vertex.add("E");
        vertex.add("F");
        vertex.add("G");
        vertex.add("H");

        List<Edge> edges = new ArrayList<>(); // jadi visual edges nya coba di paint yach
        // pakai index dari vertex
        edges.add(new Edge(0, 1));
//        edges.add(new Edge("A", "B"));
//        edges.add(new Edge("A", "C"));
//        edges.add(new Edge("A", "D"));
//        edges.add(new Edge("B", "E"));
//        edges.add(new Edge("B", "F"));
//        edges.add(new Edge("C", "G"));
//        edges.add(new Edge("D", "H"));
//        edges.add(new Edge("E", "H"));
//        edges.add(new Edge("F", "H"));
//        edges.add(new Edge("G", "H"));


        // -----
        // untuk mengurangi time complexity, seperti find node are connected
        // kita bisa menggunakan metode matrix atau 2d array


        // ----
        // boost performance untuk space complexity dapat ditingkatkan lagi dengan cara
        // menggunakan custom size pada 2d array: ex: arr[0] = new arr[custom_size];

    }

}
