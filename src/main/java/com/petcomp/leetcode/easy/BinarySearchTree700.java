package com.petcomp.leetcode.easy;

public class BinarySearchTree700 {

    public TreeNode search(TreeNode root, int val){

        if(root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        if (root.val > val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }
}
