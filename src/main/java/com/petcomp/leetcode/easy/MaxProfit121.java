package com.petcomp.leetcode.easy;

public class MaxProfit121 {

    public int maxProfit(int[] prices){

        int maxSub = 0;

        int minPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            minPrice = min(minPrice, prices[i]);
            maxSub = max(maxSub, prices[i] - minPrice);
        }

        return maxSub;
    }

    private int min(int a, int b){
        return a > b ? b : a;
    }

    private int max(int a, int b){
        return a > b ? a : b;
    }
}
