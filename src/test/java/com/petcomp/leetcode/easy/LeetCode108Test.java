package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LeetCode108Test {

    @Test
    public void testSortedArrayToBST(){

        SortedArrayToBST108 solution = new SortedArrayToBST108();

        int[] nums = {-10, -3, 0 , 5 ,9};
        TreeNode treeNode = solution.sortedArrayToBST(nums);

        TreeTravelsal treeTravelsal = new TreeTravelsal();
        List<Integer> integers = treeTravelsal.preOrderTravelsal(treeNode);

        System.out.println(integers);
    }
}
