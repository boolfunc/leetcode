package com.petcomp.leetcode.easy;

public class MaxDepth104 {

    /**
     * 获取一棵二叉树的最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root){

        if (root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}
