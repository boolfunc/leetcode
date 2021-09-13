package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LeetCode566Test {

    @Test
    public void testReshape(){

        int[][] mat = {{1,2},{3,4}};

        MatrixReshape566 matrix = new MatrixReshape566();
        int[][] result = matrix.matrixReshape(mat, 1, 4);
        for(int i = 0; i < result.length; i++){

           System.out.print(Arrays.toString(result[i]));
        }
    }
}
