package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar387 {

    public int findFirstUniqChar(String str){

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if (map.get(arr[i]) == null){
                map.put(arr[i], Integer.valueOf(i));
            }else{
                map.put(arr[i], -1);
            }
        }

        for(int i = 0; i < arr.length; i++){
            if (map.get(arr[i]) >= 0){
                return map.get(arr[i]);
            }
        }

        return -1;
    }
}
