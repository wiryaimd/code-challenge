package com.wiryaimd.codechallenge.leetcode.tree;

import com.wiryaimd.codechallenge.ds.binarytree.BST;
import com.wiryaimd.codechallenge.ds.binarytree.traversal.BSF;

public class MaxDepth {

    private static int max = 0;
    private static int depth = 0;

    // completed, metode random tapi work anjaee
    // please understand thsi code, it increases how to think recursively
    public static int maxDepth(BST.Node root) {
        if(root == null){
            return max;
        }

        depth += 1;

        System.out.println("depth b: " + depth + " val " + root.data);
        maxDepth(root.left);
        maxDepth(root.right);
        if(depth > max){
            max = depth;
        }

        System.out.println("depth rm: " + depth + " val " + root.data);
        depth -= 1;

        return max;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(13);
        bst.insert(6);
        bst.insert(8);
        bst.insert(6);
        bst.insert(12);
        bst.insert(15);
        bst.insert(11);
        bst.insert(9);
        bst.insert(13);

        BSF.bsf(bst.root);

        System.out.println("max: " + maxDepth(bst.root));

    }

}
