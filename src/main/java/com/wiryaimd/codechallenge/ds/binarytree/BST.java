package com.wiryaimd.codechallenge.ds.binarytree;

public class BST { // binary search tree

    public static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(){}

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node root;

    public void insert(int val){
        root = insert(root, val);
    }

    private Node insert(Node root, int val){
        if (root == null){
            root = new Node(val, null, null);
            return root;
        }else if(val <= root.data){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void printVal(Node node){
        if (node != null){
            printVal(node.left);
            System.out.println(node.data);
            printVal(node.right);
        }
    }

    public boolean search(int val){
        return search(root, val);
    }

    private boolean search(Node node, int val){

        if (node == null){
            return false;
        }else if(node.data == val){
            return true;
        }else if (val < node.data){
            return search(node.left, val);
        }else{
            return search(node.right, val);
        }
    }
}
