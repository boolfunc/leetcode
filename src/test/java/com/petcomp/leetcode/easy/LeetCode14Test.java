package com.petcomp.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeetCode14Test {
    
    @Test
    public void testLongestCommonPrefix(){

        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs1 = new String[]{"flower", "flow", "flight"};
       
        assertEquals("fl", solution.getLongestCommonPrefix(strs1).toString());

        String[] strs2 = new String[]{"dog", "racecar", "car"};

        assertEquals("", solution.getLongestCommonPrefix(strs2).toString());

        assertEquals("", solution.getLongestCommonPrefix(new String[0]));

        String[] str3 = new String[]{"a"};
        assertEquals("a", solution.getLongestCommonPrefix(str3));
    }
}
