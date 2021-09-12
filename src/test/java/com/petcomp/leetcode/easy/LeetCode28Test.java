package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode28Test {

    @Test
    public void testStrStr(){
        StrStr28 str = new StrStr28();
        //"mississippi"
        //"issipi"
        System.out.println(str.index("mississippi", "issippi"));
    }
}
