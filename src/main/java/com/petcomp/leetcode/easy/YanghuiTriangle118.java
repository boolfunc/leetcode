package com.petcomp.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class YanghuiTriangle118 {

    public List<List<Integer>> generate(int numRows){

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){

            List<Integer> inner = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                if (j == 1 || j == i){
                    inner.add(1);
                }else if(i > 1){
                    inner.add(result.get(i - 2).get(j-2) + result.get(i - 2).get(j-1));
                }
            }
            result.add(inner);
        }

        return result;
    }

    public List<Integer> getRow(int rowIndex){
        List<List<Integer>> triangle = generate(rowIndex + 1);
        return triangle.get(rowIndex);
    }
}
