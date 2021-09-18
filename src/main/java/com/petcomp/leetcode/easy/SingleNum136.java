package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNum136 {

    public int singleNum(int[] nums){

        Map<Integer, Boolean> map = new HashMap<>();

        for(int num : nums){
            if (map.get(num) == null){
                map.put(num, Boolean.TRUE);
            }else{
                map.put(num, Boolean.FALSE);
            }

        }

        for(Map.Entry<Integer, Boolean> entry : map.entrySet()){
            if (entry.getValue().equals(Boolean.TRUE)){
                return entry.getKey();
            }
        }

        return -1;
    }
}
