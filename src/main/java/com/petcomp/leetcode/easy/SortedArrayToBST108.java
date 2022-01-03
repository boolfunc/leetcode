package com.petcomp.leetcode.easy;

//FIXME wrong
public class SortedArrayToBST108 {

    public TreeNode sortedArrayToBST(int[] nums){

        TreeNode root = null;

        for(int num : nums){
            root = arrangeSortedArrayToBST(root, num);
        }

        return root;
    }

    public TreeNode arrangeSortedArrayToBST(TreeNode root, int num){
        if (root == null){
            root = new TreeNode(num);
            return root;
        }
        if (root.val > num){
            if (root.left != null && root.left.val < num){
                TreeNode newRoot = new TreeNode(num);
                newRoot.left = root.left;
                newRoot.right = root;
                root.left = null;
                return newRoot;
            }else{
                 arrangeSortedArrayToBST(root, num);
                 return root;
            }

        }else{
            if (root.right != null && root.right.val < num){
                TreeNode newRoot = new TreeNode(num);
                newRoot.right = root.right;
                newRoot.left = root;
                root.right = null;
                return newRoot;
            }else{
                arrangeSortedArrayToBST(root, num);
                return root;
            }

        }
    }




}
