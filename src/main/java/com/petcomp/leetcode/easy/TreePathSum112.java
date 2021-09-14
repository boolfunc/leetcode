package com.petcomp.leetcode.easy;

public class TreePathSum112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null){
            return false;
        }

        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.left, targetSum - root.val);
    }
}
