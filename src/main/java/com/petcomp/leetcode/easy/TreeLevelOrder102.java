package com.petcomp.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class TreeLevelOrder102 {

    public List<List<Integer>> levelOrder(TreeNode root){

        if (root == null){
            return null;
        }

        List<List<Integer>> all = new ArrayList<>();
        if (root.left == null && root.right == null){
            List<Integer> rootList = new ArrayList<>();
            rootList.add(root.val);
            all.add(rootList);
        }

        List<List<Integer>> left = levelOrder(root.left);
        List<List<Integer>> right = levelOrder(root.right);

        List<Integer> temp = new ArrayList<>();
        if (left != null && !left.isEmpty()){
            temp.addAll(left.get(0));
        }
        if (right!=null && !right.isEmpty()){
            temp.addAll(right.get(0));
        }

        all.add(temp);

        return all;
    }

}
