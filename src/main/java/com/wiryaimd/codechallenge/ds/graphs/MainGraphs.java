package com.wiryaimd.codechallenge.ds.graphs;

public class MainGraphs {

    public static void main(String[] args) {

        // ---
        // tree is special kind of graphs
        // ---

        // graph mirip kaya tree, yaitu memiliki konektivitas antara node satu dengan lain
        // graph di def dengan G = (V, E)
        // dimana V = vertices / vertex (sudut)
        // dan    E = edges (sisi)

        // jadi V itu == node
        // dan E itu == kaya traversalnya (ex E = node1 ->ke-> node2)

        // graph terdapat 2 jenis
        // - directed graph (digraph)
        // - undirected graph

        // lambang kurung () sebagai sorted graph
        // lambang kurawal {} sebagai unsorted graph

        // directed graph: ()
        // edgesnya hanya mengarah ke satu arah (unidirectional)
        // ex: node1 ---> node2

        // undirected graph:
        // edgesnya punya dua arah (bidirectional)
        // ex: node1 <-----> node2

        // graph juga memiliki weighted graph, dan unweighted graph
        // - weigthed graph: yaitu edges yang mempunyai nilai/value.. jadi node1 ke node2 memiliki jarak atau nilai pada edges tsb
        // - unweighted graph: edges yang tidak mempunyai nilai/value... jadi anggap aja setiap edgesnya mempunyai nilai sama yaitu weight = 1



        // menghitung kemungkinan max & min edges melalui jumlah vertices

        // max directed graph
        // max = n(n - 1) dimana n = jumlah vertices/vertex/node
        // ex: node = 4; maka possible max edges = 4(4 - 1) = 12

        // max undirected graph
        // max = n(n - 1) / 2
        // ex: node = 4; 4(4-1) / 2 = 6
        // (coba aja paint yachh biar ngerti)

        // min = 0;


        // PATH
        // jadi path itu kaya, urutan jalan atau edges dari node1 ke node tujuan,
        // for ex: PATH dari nodeA ke nodeE adalah -> nodeA-NodeB-nodeC-nodeD-nodeE

        // walk: kata untuk setiap node yg terhubung melalui edges
        // adapun simple path -> 'walk' dimana tidak ada vertices ataupun edges yang diulang/repeated untuk dilewati

        // trail: 'walk' dimana tidak ada edges yang diulang untuk dilewati
        // closed walk: dimana start and end nya berada pada vertex yg sama
        // acyclic graph: graph with no cycle (ex: binary tree yach)



    }

}
