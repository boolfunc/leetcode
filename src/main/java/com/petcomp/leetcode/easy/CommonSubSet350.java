package com.petcomp.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonSubSet350 {



    public int[] intersect(int[] nums1, int[] nums2){

        Map<Integer, Boolean> processed1 = new HashMap<>();
        Map<Integer, Boolean> processed2 = new HashMap<>();

        int[] result = new int[nums1.length];
        int k = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if (processed1.get(Integer.valueOf(i)) == null && processed2.get(Integer.valueOf(j)) == null){
                    if (nums1[i] == nums2[j]){
                        result[k++] = nums1[i];
                        processed1.put(Integer.valueOf(i), true);
                        processed2.put(Integer.valueOf(j), true);
                    }
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
}
