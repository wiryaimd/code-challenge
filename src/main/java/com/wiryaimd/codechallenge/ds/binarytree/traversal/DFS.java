package com.wiryaimd.codechallenge.ds.binarytree.traversal;

import com.wiryaimd.codechallenge.ds.binarytree.BST;

public class DFS { // depth first search

    // data left right (DLR)
    public static void preorder(BST.Node root){
        if (root == null){
            return;
        }

        System.out.println("DFS PREORDER: " + root.data);
        preorder(root.left);
        preorder(root.right);
    }

    // left data right (LDR)
    public static void inorder(BST.Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.println("IN ORDER: " + root.data);
        inorder(root.right);

    }

    // left right data (LRD)
    public static void postorder(BST.Node root){
        if (root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println("POST ORDER: " + root.data);
    }

    public static void main(String[] args) {

    }

}
