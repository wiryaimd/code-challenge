package com.wiryaimd.codechallenge.leetcode.tree;

import com.wiryaimd.codechallenge.ds.binarytree.BST;

public class SortedArrayToBalancedBinarySearchTree {


    // uncompleted, need binary search method to insert brohhh
    public BST.Node sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        int start = 0, end = nums.length - 1;
        BST.Node node = new BST.Node(nums[mid], null, null);

        while(start > end){
            mid = start + (end - start) / 2;

            node = insert(node, nums[mid]);

            start = mid + 1;
        }

        return node;
    }

    public BST.Node insert(BST.Node node, int val){
        if(node == null){
            node = new BST.Node(val, null, null);
            return node;
        }

        if(node.data >= val){
            node.left = insert(node.left, val);
        }else{
            node.right = insert(node.right, val);
        }

        return node;
    }

    public static void main(String[] args) {



    }

}
