package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode104Test {

    @Test
    public void testMaxDepth(){

        TreeNode node = new TreeNode();
        node.val = 1;
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(4);

        MaxDepth104 depth = new MaxDepth104();

        System.out.println(depth.maxDepth(node));
        System.out.println(depth.maxDepth(null));


    }
}
