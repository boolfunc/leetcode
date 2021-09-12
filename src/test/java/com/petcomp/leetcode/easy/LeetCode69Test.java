package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode69Test {

    @Test
    public void testIntSqrt(){
        IntSqrt69 sqrt = new IntSqrt69();
        System.out.println(sqrt.intSqrt(0));
        System.out.println(sqrt.intSqrt(4));
        System.out.println(sqrt.intSqrt(6));

        System.out.println(sqrt.intSqrt(8));
        System.out.println(sqrt.intSqrt(2147483647));

    }
}
