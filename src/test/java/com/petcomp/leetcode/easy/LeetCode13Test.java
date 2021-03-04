package com.petcomp.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeetCode13Test {
    
    @Test
    public void testRomanToInt(){

        RomanToInt solution = new RomanToInt();

        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
