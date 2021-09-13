package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode121Test {

    @Test
    public void testMaxProfit(){

        MaxProfit121 maxProfit = new MaxProfit121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit.maxProfit(prices));

        int[] prices2 = {7,6,5,4,3,2,1};
        System.out.println(maxProfit.maxProfit(prices2));
    }
}
