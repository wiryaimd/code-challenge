package com.wiryaimd.codechallenge.hackerrank.ds.binarytree;

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

        BST bst = new BST();
        bst.insert(32);
        bst.insert(1);
        bst.insert(22);
        bst.insert(3);
        bst.insert(34);

        bst.printVal(bst.root);

        System.out.println(bst.search(22));


    }

}
