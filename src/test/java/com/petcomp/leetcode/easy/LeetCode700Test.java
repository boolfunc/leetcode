package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode700Test {

    @Test
    public void testSearch(){

        BinarySearchTree700 solution = new BinarySearchTree700();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);


        TreeNode searched = solution.search(root, 2);

        System.out.println(searched.val);
    }
}
