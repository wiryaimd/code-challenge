package com.wiryaimd.codechallenge.leetcode.tree;

import com.wiryaimd.codechallenge.ds.binarytree.BST;

public class SortedArrayToBalancedBinarySearchTree {


    // uncompleted to completed, need binary search method to insert brohhh. done
    public BST.Node sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        return toBalanced(nums, 0, nums.length - 1);
    }

    // maybe theres no solution more like this shit
    // logicnya memakai rekursif binary search yachh
    // agar binary treenya balanced, perlu untuk memilih value yg pas gitu, pokonya value yg di tengah antara tengah / divide
    public BST.Node toBalanced(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int mid = start + (end - start) / 2;

        BST.Node node = new BST.Node(nums[mid]); // node root saat rekursif pertama kali
        node.left = toBalanced(nums, start, mid - 1); // insert node left dengan posisi value middle left
        node.right = toBalanced(nums, mid + 1, end); // insert node right dengan mid + 1 ke right ya

        return node; // return node yakan;

    }


    // just insert and not make balanced
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
