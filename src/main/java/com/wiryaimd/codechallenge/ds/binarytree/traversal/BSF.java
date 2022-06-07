package com.wiryaimd.codechallenge.ds.binarytree.traversal;

import com.wiryaimd.codechallenge.ds.binarytree.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BSF {

    // pemakaian breadth search first dengan traversal level order
    public static void bsf(BST.Node root){
        if (root == null){
            return;
        }

        Queue<BST.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            BST.Node node = queue.peek();

            System.out.println("bsf data: " + node.data);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

            queue.poll();
        }
    }

    public static void main(String[] args) {

    }

}
