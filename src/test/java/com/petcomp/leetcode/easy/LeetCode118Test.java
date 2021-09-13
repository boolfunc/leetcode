package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode118Test {

    @Test
    public void testGenerateYanghuiTriangle(){
        YanghuiTriangle118 solution = new YanghuiTriangle118();

        System.out.println(solution.generate(1));

        System.out.println(solution.generate(3));

        System.out.println(solution.generate(5));


    }
}
