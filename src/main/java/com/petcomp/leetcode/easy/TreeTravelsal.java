package com.petcomp.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class TreeTravelsal {

    public List<Integer> inOrderTravelsal(TreeNode root){

        List<Integer> list = new ArrayList<>();

        inOrderTravelsal(root, list);

        return list;
    }

    /**
     * 中序遍历
     * @param root
     * @param list
     */
    private void inOrderTravelsal(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        inOrderTravelsal(root.left, list);
        list.add(root.val);
        inOrderTravelsal(root.right, list);
    }

    /**
     * 前序遍历
     * @param root
     * @param list
     */
    private void preOrderTravelsal(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        list.add(root.val);
        preOrderTravelsal(root.left, list);
        preOrderTravelsal(root.right, list);
    }

    /**
     * 后续遍历
     * @param root
     * @param list
     */
    private void postOrderTravelsal(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        postOrderTravelsal(root.right, list);

        postOrderTravelsal(root.left,list);
        list.add(root.val);
    }

    public List<Integer> preOrderTravelsal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        preOrderTravelsal(root, list);
        return list;
    }

    public List<Integer> postOrderTravelsal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        postOrderTravelsal(root, list);
        return list;
    }

}
