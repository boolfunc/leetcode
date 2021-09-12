package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode35Test {

    @Test
    public void testSearchInsert(){

        SearchInsert35 search  = new SearchInsert35();
        int nums[] = {1 ,3 ,5, 6};
        System.out.println(search.searchInsert(nums, 1));
        System.out.println(search.searchInsert(nums, 2));
        System.out.println(search.searchInsert(nums, 3));
        System.out.println(search.searchInsert(nums, 4));
        System.out.println(search.searchInsert(nums, 7));

        int nums2[] = {1};
        System.out.println(search.searchInsert(nums2, 0));


    }
}
