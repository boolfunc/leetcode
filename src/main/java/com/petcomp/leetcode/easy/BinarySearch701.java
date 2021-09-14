package com.petcomp.leetcode.easy;

public class BinarySearch701 {

    public TreeNode build(int[] nums){

        if (nums.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(nums[0]);

        for(int i = 1; i < nums.length; i++){
            insert(root, nums[i]);
        }
        return root;
    }

    private TreeNode insert(TreeNode root, int num){

        if (root == null){
            return new TreeNode(num);
        }
        if (root.val > num){
            root.left = insert(root.left, num);
        }else {
            root.right = insert(root.right, num);
        }
        return root;
    }
}
