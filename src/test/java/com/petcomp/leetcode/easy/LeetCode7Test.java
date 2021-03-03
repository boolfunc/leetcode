package com.petcomp.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeetCode7Test {
    

    @Test
    public void testReverseInt(){

        ReverseInt solution = new ReverseInt();

        int result = solution.reverse(123);
        assertEquals(321, result);
        

        assertEquals(-123, solution.reverse(-321));

        assertEquals(21, solution.reverse(120));

        assertEquals(0, solution.reverse(0));

        assertEquals(0, solution.reverse(1534236469));

        assertEquals(0, solution.reverse(-2147483648));
    }
}
