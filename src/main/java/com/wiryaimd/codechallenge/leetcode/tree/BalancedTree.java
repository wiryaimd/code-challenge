package com.wiryaimd.codechallenge.leetcode.tree;

import com.wiryaimd.codechallenge.ds.binarytree.BST;

public class BalancedTree {


    // need to understand this shit ples
    public boolean isBalanced(BST.Node root) {
        if(root == null){
            return true;
        }

        return countHeight(root) != -1;

    }

    public int countHeight(BST.Node node){
        if(node == null){
            return 0;
        }

        int left = countHeight(node.left);
        int right = countHeight(node.right);

        if(left == -1){
            return -1;
        }

        if(right == -1){
            return -1;
        }

        if(Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left, right) + 1;


    }

}
