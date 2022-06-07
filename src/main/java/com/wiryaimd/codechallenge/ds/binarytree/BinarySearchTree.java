package com.wiryaimd.codechallenge.ds.binarytree;

import com.wiryaimd.codechallenge.ds.binarytree.traversal.BSF;
import com.wiryaimd.codechallenge.ds.binarytree.traversal.DFS;

public class BinarySearchTree {

    public static void main(String[] args) {
        // atau disebut BST
        // complexity waktu dari operasi
        // Search, Insert, Remove hanya O log n
        // berbeda dengan array atau linkedlist punya O n saat search/insert/remove

        // complexity BST dapat menjadi log n ketika BST nya berbetuk balanced yach..

        // ketentuan isi data bst
        // child kiri pada bst harus lebih kecil dari child kanan ... child kiri < child kanan
        // jika saat insert, maka dicek node tersebut lebih kecil atau besar dari val node, jika lebih kecil bawa ke kiri else kanan

        // ada jenis binary tree
        // strict/proper bst -> ketika bide nya memiliki 0 child atau 2 child (tidak termasuk memiliki 1 child)
        // complete bst ->
        // perfect bst
        // balanced bst

        // traversal: adalah proses melakukan kunjungan ke suatu node, melewati node gituchh, exactly one si some order
        // beberapa jenis traversal atau cara untuk traversal antara lain
        // - breadth-first (BFS): jadi breadth-first melewati nodenya ini mirip kaya heap
        //                        node nya bakal ngesearch node mulai dari kiri ke kanan (eg dari root -> left child -> right child -> left.left child -> left.right child -> dst)
        // - depth-first (DFS): berbeda dengan bfs, depth-first bakal ngesearch sampai ke child child nya dulu
        //                      eg dari root -> left child -> kemudian di left child itu di search semua child nya sampai habis, lalu pindah ke right child
        //      adapun jenis order dari DFS (eg dengan membaca node root lalu baca child kiri dst)
        //      - dari root -> search ke left child -> search ke right child === PREORDER (DLR) -> data left right
        //      - dari left child -> ke root -> ke right child === INORDER (LDR) -> left data right
        //      - dari left child - ke right child -> ke root === POSTORDER (LRD) -> left right data
        //      jadi maksud dari dlr, ldr, lrd adalah
        //      urutan memproses data nya eg: LDR: akan ke left child dulu hingga terujung baru membaca datanya, kemudian ke right child, baca data

        // BFS: jadi kita dapat menggunakan: Level-Order-Traversal
        //      jadi level order traversal bakal baca data dari kiri-kanan yekan dan caranya itu pake
        //      queue ds, kemudian enq current node, lalu baca child nya, kemudian enq child nya lalu deq first node dst

        BST bst = new BST();
        bst.insert(32);
        bst.insert(1);
        bst.insert(22);
        bst.insert(-3);
        bst.insert(3);
        bst.insert(34);
        bst.insert(33);

        BSF.bsf(bst.root); // penggunaan BSF

        DFS.preorder(bst.root); // penggunaan DFS jenis preorder
        DFS.inorder(bst.root); // DFS inorder
        DFS.postorder(bst.root); // DFS postorder

        bst.printVal(bst.root);

        System.out.println(bst.search(22));


    }


    // is a binary tree
//    public static boolean isLess(BST.Node root){
//
//    }
//
//    public static boolean isGreater(BST.Node root){
//
//    }
//
//    public static boolean isBinaryTree(BST.Node root){
//        if (root == null){
//            return true;
//        }
//
//        if ()
//
//        return false;
//    }

}
