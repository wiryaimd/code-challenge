package com.wiryaimd.codechallenge.ds.graphs;

public class Edge { // sisi

//    private String startVertex;
//    private String endVertex; // instead memakai string, kita bisa menggunakan int sebagai index address untuk referensi node/vertexnya
    // ini akan lebih menghemat memory yakann

    private int startVertex;
    private int endVertex;
//    private int weight; // jika ingin pakai weight


    public Edge(int startVertex, int endVertex) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }

    public int getStartVertex() {
        return startVertex;
    }

    public int getEndVertex() {
        return endVertex;
    }
}
