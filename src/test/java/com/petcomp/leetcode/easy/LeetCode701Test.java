package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LeetCode701Test {

    @Test
    public void testBuildTree(){
        int[] nums = {2,4,1,5,3};

        BinarySearch701 solution = new BinarySearch701();

        TreeNode root = solution.build(nums);

        TreeTravelsal treeTravelsal = new TreeTravelsal();

        List<Integer> list = treeTravelsal.preOrderTravelsal(root);

        System.out.println(list);
    }
}
