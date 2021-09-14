package com.petcomp.leetcode.easy;

public class InvertTree226 {

    public TreeNode invertTree(TreeNode root){

        if (root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
